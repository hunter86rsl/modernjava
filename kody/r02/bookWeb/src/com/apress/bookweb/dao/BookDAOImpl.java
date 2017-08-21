package com.apress.bookweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.apress.bookweb.model.Author;
import com.apress.bookweb.model.Book;
import com.apress.bookweb.model.Category;

public class BookDAOImpl implements BookDAO {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
		}
	}

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/książki",
				"root", "hasło");
	}

	private void closeConnection(Connection connection) {
		if (connection == null)
			return;
		try {
			connection.close();
		} catch (SQLException ex) {
		}
	}

	public List<Book> findAllBooks() {
		List<Book> result = new ArrayList<Book>();
		List<Author> authorList = new ArrayList<Author>();

		String sql = "select * from książka inner join autor on książka.id = autor.id_książki";

		Connection connection = null;
		try {
			connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Book book = new Book();
				Author author = new Author();
				book.setId(resultSet.getLong("id"));
				book.setBookTitle(resultSet.getString("tytuł_książki"));
				book.setCategoryId(resultSet.getLong("id_kategorii"));
				author.setBookId(resultSet.getLong("id_książki"));
				author.setFirstName(resultSet.getString("imię"));
				author.setLastName(resultSet.getString("nazwisko"));
				authorList.add(author);
				book.setAuthors(authorList);
				result.add(book);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeConnection(connection);
		}
		return result;
	}

	@Override
	public List<Book> searchBooksByKeyword(String keyWord) {
		List<Book> result = new ArrayList<Book>();
		List<Author> authorList = new ArrayList<Author>();

		String sql = "select * from książka inner join autor on książka.id = autor.id_książki"
				+ " where tytuł_książki like '%"
				+ keyWord.trim()
				+ "%'"
				+ " or imię like '%"
				+ keyWord.trim()
				+ "%'"
				+ " or nazwisko like '%" + keyWord.trim() + "%'";

		Connection connection = null;
		try {

			connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Book book = new Book();
				Author author = new Author();
				book.setId(resultSet.getLong("id"));
				book.setBookTitle(resultSet.getString("tytuł_książki"));
				author.setFirstName(resultSet.getString("imię"));
				author.setLastName(resultSet.getString("nazwisko"));
				author.setBookId(resultSet.getLong("id_książki"));
				authorList.add(author);
				book.setAuthors(authorList);
				result.add(book);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeConnection(connection);
		}

		return result;
	}

	public List<Category> findAllCategories() {
		List<Category> result = new ArrayList<>();
		String sql = "select * from kategoria";

		Connection connection = null;
		try {
			connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Category category = new Category();
				category.setId(resultSet.getLong("id"));
				category.setCategoryDescription(resultSet
						.getString("opis_kategorii"));
				result.add(category);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeConnection(connection);
		}
		return result;
	}

	public void insert(Book book) {
		Connection connection = null;
		try {
			connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"insert into Book (tytuł_książki) values (?)",
					Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, book.getBookTitle());
			statement.execute();
			ResultSet generatedKeys = statement.getGeneratedKeys();
			if (generatedKeys.next()) {
				book.setId(generatedKeys.getLong(1));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeConnection(connection);
		}
	}

	public void update(Book book) {
	}

	public void delete(Long bookId) {
		Connection connection = null;

		try {
			connection = getConnection();
			PreparedStatement statement = connection
					.prepareStatement("delete from książka where id=?");
			statement.setLong(1, bookId);
			statement.execute();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeConnection(connection);
		}
	}
}