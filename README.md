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

* 어떤 상황에 어떤 방식의 request를 써야하나요?

* RESTful한 API를 설계했나요? 어떤 부분이 그런가요? 어떤 부분이 그렇지 않나요?

* 적절한 관심사 분리를 적용하였나요? (Controller, Repository, Service)

* 작성한 코드에서 빈(Bean)을 모두 찾아보세요!

* API 명세서 작성 가이드라인을 검색하여 직접 작성한 명세서와 비교해보세요!
