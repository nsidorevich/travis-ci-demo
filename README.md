# Circle CI
Pay attention to how variable is defined in `.circleci/config.yml`
```
curl --location --request POST 'https://circleci.com/api/v2/project/gh/nsidorevich/junit5-demo/pipeline' \
--header 'Circle-Token: <TOKEN>' \
--header 'Accept: application/json' \
--header 'Content-Type: application/json' \
--data-raw '{
  "parameters": {
    "rerun-context": "sergey-dasher"
  }
}'
```