# Post System - CRUD with JWT Authorization

A complete post management system with Java Spring Boot backend and HTML frontend, featuring JWT token-based authentication and comprehensive exception handling.

## 🚀 Features

### Backend (Java Spring Boot)
- **Post Entity Management**: Complete CRUD operations for blog posts
- **JWT Authentication**: Secure token-based authentication and authorization
- **Spring Security**: Stateless session management with JWT filter
- **Exception Handling**: Global exception handler for consistent error responses
- **H2 Database**: In-memory database for easy development and testing
- **RESTful API**: Clean and well-structured REST endpoints

### Frontend (HTML/JavaScript)
- **Modern UI**: Gradient design with responsive layout
- **Authentication**: Login form with token management
- **Post Management**: Create, read, update, and delete posts
- **Search**: Search posts by title
- **Real-time Updates**: Dynamic UI updates without page refresh

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## 🔧 Installation & Running

1. **Clone the repository**
   ```bash
   git clone https://github.com/Edwin0319/post-system-CRUD-token-authorization-exception-.git
   cd post-system-CRUD-token-authorization-exception-
   ```

2. **Build the project**
   ```bash
   mvn clean package
   ```

3. **Run the application**
   ```bash
   java -jar target/post-system-1.0.0.jar
   ```

4. **Access the application**
   - Frontend: http://localhost:8080
   - H2 Console: http://localhost:8080/h2-console
     - JDBC URL: `jdbc:h2:mem:postdb`
     - Username: `sa`
     - Password: (leave empty)

## 📡 API Endpoints

### Authentication
- `POST /api/auth/login` - Generate JWT token
  ```json
  Request: {"username": "john"}
  Response: {"token": "eyJ...", "username": "john"}
  ```

- `GET /api/auth/validate` - Validate JWT token
  ```
  Header: Authorization: Bearer {token}
  ```

### Posts (All require JWT authentication)
- `GET /api/posts` - Get all posts
- `GET /api/posts/{id}` - Get post by ID
- `POST /api/posts` - Create new post
  ```json
  {"title": "Post Title", "content": "Post content"}
  ```
- `PUT /api/posts/{id}` - Update post
  ```json
  {"title": "Updated Title", "content": "Updated content"}
  ```
- `DELETE /api/posts/{id}` - Delete post
- `GET /api/posts/search?keyword={keyword}` - Search posts

## 🎨 Frontend Usage

1. **Login**: Enter any username and click "Login" to generate a JWT token
2. **Create Post**: Fill in the title and content, then click "Create Post"
3. **View Posts**: All posts are displayed with author and timestamps
4. **Edit Post**: Click "Edit" button, modify the content, and click "Save"
5. **Delete Post**: Click "Delete" button and confirm
6. **Search**: Enter a keyword and click "Search" to filter posts

## 🏗️ Project Structure

```
post-system/
├── src/
│   ├── main/
│   │   ├── java/com/example/postsystem/
│   │   │   ├── controller/          # REST controllers
│   │   │   ├── model/               # Entity classes
│   │   │   ├── repository/          # JPA repositories
│   │   │   ├── service/             # Business logic
│   │   │   ├── security/            # JWT & Security config
│   │   │   └── exception/           # Exception handlers
│   │   └── resources/
│   │       ├── static/              # HTML frontend
│   │       └── application.properties
│   └── test/                        # Test classes
├── pom.xml                          # Maven configuration
└── README.md
```

## 🔒 Security Considerations

This is a **development/demo system**. For production use, please address:

1. **JWT Secret**: Move from hardcoded to environment variable
2. **CORS**: Restrict allowed origins to specific domains
3. **Authentication**: Implement proper user validation with password hashing
4. **HTTPS**: Enable SSL/TLS for secure communication
5. **Database**: Use a production database instead of H2

## 🧪 Testing

The system has been tested with:
- ✅ User authentication and token generation
- ✅ All CRUD operations (Create, Read, Update, Delete)
- ✅ Exception handling (404, 403 errors)
- ✅ Search functionality
- ✅ Frontend UI interactions

## 📚 Technologies Used

- **Backend**: Spring Boot 3.1.5, Spring Security, Spring Data JPA
- **Authentication**: JJWT 0.11.5
- **Database**: H2 (in-memory)
- **Frontend**: HTML5, CSS3, JavaScript (Vanilla)
- **Build Tool**: Maven

## 📸 Screenshots

### Initial Page
![Initial Page](https://github.com/user-attachments/assets/9e5b5778-548f-4717-9196-f2dff8ff9044)

### Posts Management
![Posts Displayed](https://github.com/user-attachments/assets/d92eee31-c838-4b3f-8d2b-eb93dbb23de2)

### Edit Functionality
![Edit Post](https://github.com/user-attachments/assets/8533b8eb-1518-40bb-a818-0cc9ef24f91d)

## 📄 License

This project is open source and available under the MIT License.

## 👤 Author

Edwin0319
