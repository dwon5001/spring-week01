# spring-week01
## UseCase
![유스케이스](https://user-images.githubusercontent.com/113032395/193990947-a8291270-feef-4a50-9dd5-94b4003c84d4.png)
## API Table
| Method | URL             | Request                                                                                        | Response                                                                                                                                                                                                                                                                                                                                 |
|--------|-----------------|------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| GET    | /api/blogs      |                                                                                                |  { "createdAt": "2022-10-05T14:28:15.670602", "modifiedAt": "2022-10-05T14:28:15.670602", "id": 2, "title": "title", "content": "content", "username": "username"},    { "createdAt": "2022-10-05T14:27:53.008676", "modifiedAt": "2022-10-05T14:27:53.008676", "id": 1, "title": "title", "content": "content", "username": "username"} |
| GET    | /api/blogs/{id} |                                                                                                | { "createdAt": "2022-10-05T14:27:53.008676", "modifiedAt": "2022-10-05T14:27:53.008676", "id": 1, "title": "title", "content": "content", "username": "username" }                                                                                                                                                                       |
| POST   | /api/blogs      | {   "title":"title",   "content":"content",   "username":"username",   "password":"password" } | { "createdAt": "2022-10-05T14:27:53.008676", "modifiedAt": "2022-10-05T14:27:53.008676", "id": 1, "title": "title", "content": "content", "username": "username" }                                                                                                                                                                       |
| POST   | /api/blogs/{id} | { "password":"password" }                                                                      | true                                                                                                                                                                                                                                                                                                                                     |
| PUT    | /api/blogs/{id} | {   "title":"abcd",   "content":"abcd",   "username":"abcd",   "password":"abcd" }             | { "createdAt": "2022-10-05T12:22:36.708507", "modifiedAt": "2022-10-05T12:23:41.130753", "id": 1, "title": "abcd", "content": "abcd", "username": "abcd" }                                                                                                                                                                               |
| DELETE | /api/blogs/{id} |                                                                                                |                                                                                                                                                                                                                                                                                                                                          |
## QUIZ
* 수정, 삭제 API의 request를 어떤 방식으로 사용하셨나요? (param, query, body)
  *param을 사용하여 URL주소에 포한된 변수(id)를 담아 PUT과 DELETE를 사용하여 body의 값을 수정, 삭제 하였습니다.
* 어떤 상황에 어떤 방식의 request를 써야하나요?
  * 생성(POST)/조회(GET)/수정(PUT)/삭제(DELETE)
* RESTful한 API를 설계했나요? 어떤 부분이 그런가요? 어떤 부분이 그렇지 않나요?
  * 상황에 맞는 Method를 사용하며 유지보수를 쉽게 하고 가독성을 높이기 위해 객체지향 프로그래밍을 하였습니다.
* 적절한 관심사 분리를 적용하였나요? (Controller, Repository, Service)
  * Controller에서 요청을 받고 Service에서 어떤 방법으로 요청을 처리할지 정하고 Repository에서 DB에 접근해서 처리하였습니다.
* 작성한 코드에서 빈(Bean)을 모두 찾아보세요!
  * Controller, Repository, Service, Application
* API 명세서 작성 가이드라인을 검색하여 직접 작성한 명세서와 비교해보세요
  * Response 할때 '"success": true,"error”: null' 이 안뜨는것이 아쉽다.
