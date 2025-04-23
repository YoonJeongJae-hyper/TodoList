# ✅ Todo List 웹 애플리케이션

Spring Boot 기반의 간단한 Todo List 웹 애플리케이션입니다.  
사용자는 할 일을 추가하고, 완료 처리하거나 삭제할 수 있으며, 이 모든 데이터는 DB에 저장되어 새로고침 후에도 유지됩니다.

---

## 📌 주요 기능

- ✅ 할 일 추가
- ✅ 할 일 완료 처리 (체크박스)
- ✅ 할 일 삭제
- 💾 DB 연동으로 상태 유지
- 🎨 반응형 UI 및 간단한 애니메이션 효과

---

## 🛠 기술 스택

| 분류       | 사용 기술                                |
|------------|-------------------------------------------|
| Backend    | Spring Boot, Spring Web, JDBC, H2 Database |
| Frontend   | HTML, CSS, JavaScript, Thymeleaf          |
| Build Tool | Gradle                                     |
| 기타       | H2 콘솔, `schema.sql` 통한 DB 초기화       |

---

## 🗂 프로젝트 구조 (MVC 기반)

```plaintext
com.portfolio.todolist
├── controller       # HTTP 요청 처리
├── service          # 비즈니스 로직 처리
├── repository       # DB 접근 (JDBC 사용)
├── domain           # 모델 클래스 (Todo.java)
├── static           # JS / CSS 파일
├── templates        # Thymeleaf HTML 템플릿
└── resources
    ├── application.yml
    └── schema.sql
```
