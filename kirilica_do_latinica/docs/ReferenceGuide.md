# Kiril Application Reference Guide
Kiril is a pretty straight-forward application, which runs as a REST API and allows you to transcribe text from cyrillic to latin and vice-versa. The application runs on just two requests. It's something like a microservice.

### Requests
* `{{host}}/api/v1/to_cyrillic` - Translates the text from Latin to Cyrillic
* `{{host}}/api/v1/to_latin` - Translates the text from Cyrillic to Latin

### Body
It is recommended that the body, that you send to the application is as follows:
```json
{
  "text": "The text you want to translate..."
}
```

### Postman
There is a [`postman collection configuration file`](postman/Kiril.postman_collection.json), that you could use for your ease.

### Docker
To run the application I suggest using the Docker Image