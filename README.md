
#  User Management System

User Management System using Spring Boot and Mysql Database




 


## 🚀 About Me
I'm a full stack developer...

https://github.com/Deepakkr3

deepakbaitha7905@gmail.com
## API Reference

#### GetMapping

```http
@PostMapping("user")
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. PostMapping add user  |

#### Get item 

```http
 @PostMapping("users")
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. PostMapping to add  |

```http
  @GetMapping("getUsers")
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. to get users  |

```http


@GetMapping("userid/id/{id}")
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. to get users  by id |

`` @PutMapping("update/id/{id}")`

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. to get users user by id  |

```
 @DeleteMapping("users/ids")
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. to delet  users by id   |

