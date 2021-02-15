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

# Travis CI
Reference [here](https://docs.travis-ci.com/user/triggering-builds/). Make sure to specify `merge-mode`.
```
curl --location --request POST 'https://api.travis-ci.com/repo/nsidorevich%2Ftravis-ci-demo/requests' \
--header 'Travis-API-Version: 3' \
--header 'Authorization: token <token>' \
--header 'Accept: application/json' \
--header 'Content-Type: application/json' \
--data-raw '{
    "request": {
        "branch": "develop",
        "merge_mode": "deep_merge",
        "config": {
            "env": {
                "jobs": [
                    "RERUN_CONTEXT=sergey-dasher"
                ]
            }
        }
    }
}'
```
