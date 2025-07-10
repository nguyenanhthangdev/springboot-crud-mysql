----- Spring Boot CRUD + MySQL:
+ Một ứng dụng web đơn giản quản lý sản phẩm sử dụng Spring Boot, Spring Data JPA, MySQL và Thymeleaf.

----- Chức năng:
+ Hiển thị danh sách sản phẩm
+ Thêm sản phẩm
+ Sửa sản phẩm
+ Xóa sản phẩm
+ Giao diện đơn giản với Thymeleaf
+ Kết nối cơ sở dữ liệu MySQL

----- Công nghệ sử dụng:
+ Spring Boot	Framework chính
+ Spring Data JPA	Tương tác với cơ sở dữ liệu
+ Thymeleaf	View template
+ MySQL	Cơ sở dữ liệu
+ Maven	Quản lý thư viện

----- Cấu hình application.properties:
+ spring.datasource.url=jdbc:mysql://localhost:3306/demospringdatajpa
+ spring.datasource.username=root
+ spring.datasource.password=
+ spring.jpa.hibernate.ddl-auto=update

----- Cách chạy project:
+ Clone repo: git clone https://github.com/nguyenanhthangdev/springboot-crud-mysql.git
+ Mở bằng VSCode hoặc IntelliJ
+ Cấu hình database trong application.properties
+ Chạy SpringDataJpaApplication.java
