// validation.js

function CheckAddBook() {
	var bookId = document.getElementById("bookId"); // 도서 아이디
	var name = document.newBook.name.value; // 도서명
	var unitPrice = document.newBook.unitPrice.value; // 가격
	var unitsInStock = document.newBook.unitsInStock.value; // 재고 수

	if (!check(/^ISBN[0-9]{1,8}$/, bookId, "[도서코드]\nISBN과 숫자를 조합하여 5~12자까지 입력하세요.\n첫글자는 반드시 ISBN으로 시작하세요."))
		return false;

	if (name.length < 4 || name.length > 12) { // 도서명의 문자 길이가 4~12자인지 유효성 검사
		alert("도서명은 4~12자까지 입력 가능합니다.");

		document.newBook.name.select();
		document.newBook.name.focus();
		return false;
	}

	if (unitPrice.length == 0 || isNaN(unitPrice)) { // 가격의 문자 길이가 0인지 숫자인지 유효성 검사
		alert("가격은 숫자를 입력해야 합니다.");

		document.newBook.unitPrice.select();
		document.newBook.unitPrice.focus();
		return false;
	}

	if (unitPrice < 0) { // 가격이 음수인지 유효성 검사
		alert("가격에 음수는 입력 불가능합니다.");

		document.newBook.unitPrice.select();
		document.newBook.unitPrice.focus();
		return false;
	}

	if (isNaN(unitsInStock)) { // 재고 수가 숫자인지 유효성 검사
		alert("재고 수에 숫자만 입력 가능합니다.");

		document.newBook.unitsInStock.select();
		document.newBook.unitsInStock.focus();
		return false;
	}

	function check(regExp, e, msg) {
		if (regExp.test(e.value)) { // 정규 표현식 검사
			return true;
		}

		// 오류 시
		alert(msg); // 에러 메시지 msg 출력
		e.select(); // 입력 항목 선택
		e.focus(); // 입력 항목 커서 맞춤
		return false;
	}

	document.newBook.submit();
}