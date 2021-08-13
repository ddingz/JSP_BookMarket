// BookRepository.java

package dao;

import java.util.ArrayList;

import dto.Book;

public class BookRepository {

	private ArrayList<Book> listOfBooks = new ArrayList<Book>();
	private static BookRepository instance = new BookRepository();

	public static BookRepository getInstance() {
		return instance;
	}

	public BookRepository() {
		Book html = new Book("ISBN1234", "HTML5+CSS3", 15000);
		html.setAuthor("Ȳ��ȣ");
		html.setCategory("Hello Coding");
		html.setCondition("New");
		html.setDescription(
				"���峪 PPT ������ ���� �� �ֳ���? �׷��� ���� �����ϴ�. ���� �ٷ� �������� ���ۿ� �����غ�����. ���� ���� ��ǻ�Ͱ� ��� �������ϴ�. �ڵ�� ���� ȭ���� �ٷ� ������ �����θ� �о ��� �۵��ϴ��� ���� �ľ��� �� �ִ� ���� �⺻�̰�, �߰��߰� ��� �߰��Ͽ� ����ְ� �����ϵ� ������ �� �ֽ��ϴ�.");
		html.setPublisher("�Ѻ��̵��");
		html.setReleaseDate("2018/03/02");
		html.setTotalPages(288);
		html.setUnitsInStock(1000);
		html.setFilename("ISBN1234.jpg");

		Book java = new Book("ISBN1235", "���� ���� �ڹ� ���α׷���", 27000);
		java.setAuthor("������");
		java.setCategory("IT�����");
		java.setCondition("New");
		java.setDescription(
				"��ü ������ �ٽɰ� �ڹ��� ������ ����� ����� �ٷ�鼭���ʺ��ڰ� ���� �н��� �� �ְ� �����߽��ϴ�. �ð�ȭ ������ Ȱ���� ���� ����� �������� ���� �ٽ� �ڵ带 ���� ����� ������ �� �帧���� �н��� �� �ֽ��ϴ�. ���� ������ ü���� ������ ���� �� ���� �׽�Ʈ �� ������ �������� �����ϸ� �� �ܰ辿 Ǯ�� ���� ���� ���� �� ���丮�� ���̵� ��̷ο� ���α׷��� ������ ���� ���� ���α׷��� �Ƿ��� �������� ����ø� �� �ֽ��ϴ�.");
		java.setPublisher("�Ѻ���ī����");
		java.setReleaseDate("2017/08/02");
		java.setTotalPages(692);
		java.setUnitsInStock(1000);
		java.setFilename("ISBN1235.jpg");

		Book spring = new Book("ISBN1236", "������4 �Թ�", 27000);
		spring.setAuthor("�ϼ����� ����ġ, ������ ��Ÿ��, ��Ű ������(����ö, ���μ�)");
		spring.setCategory("IT�����");
		spring.setCondition("New");
		spring.setDescription(
				"�������� �ܼ��� ��� ����� ������ �ͺ��� ��Ű��ó�� ��� �����ϰ� �����ϴ����� �� �߿��մϴ�. ������ ������ �ٿ��ִ� �����δ� ���� ���߿��� �������� ����� Ȱ���� �� �����ϴ�. �� å������ �� ���ø����̼��� ���ʸ� ������ ������ �ھ ���캸�� Ŭ���� ����Ƽ�� �Թ����� �ٷ�ϴ�. ���� �� �ǹ��� �پ�� �� ���ø����̼� �ʱ��ڳ� ���� ������ ������ �������� ����غ� �� ���� ���� ������� ������ �� ���� �����մϴ�.");
		spring.setPublisher("�Ѻ��̵��");
		spring.setReleaseDate("2017/11/01");
		spring.setTotalPages(520);
		spring.setUnitsInStock(1000);
		spring.setFilename("ISBN1236.jpg");

		listOfBooks.add(html);
		listOfBooks.add(java);
		listOfBooks.add(spring);
	}

	public ArrayList<Book> getAllBooks() {
		return listOfBooks;
	}

	public Book getBookById(String bookId) {
		Book bookById = null;

		for (int i = 0; i < listOfBooks.size(); i++) {
			Book book = listOfBooks.get(i);
			if (book != null && book.getBookId() != null && book.getBookId().equals(bookId)) {
				bookById = book;
				break;
			}
		}
		return bookById;
	}

	public void addBook(Book book) {
		listOfBooks.add(book);
	}
}