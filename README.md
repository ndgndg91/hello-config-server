# hello-config-server
- https://docs.spring.io/spring-cloud-config/docs/current/reference/html/

```bash
curl localhost:8888/TEST-APPLICATION/main 
{
  "name":"TEST-APPLICATION",
  "profiles":["main"],
  "label":null,
  "version":"bbf8144346f5525813ed0f43945176d95125b24b",
  "state":null,
  "propertySources":[
    {
      "name":"https://github.com/ndgndg91/hello-config/TEST-APPLICATION/application.yaml",
      "source":{
        "spring.application.name":"test-application",
        "test.value":1
      }
    }
  ]
}
```

```bash
giri ~ %curl localhost:8888/TEST-APPLICATION/default
{
  "name":"TEST-APPLICATION",
  "profiles":["default"],
  "label":null,
  "version":"bbf8144346f5525813ed0f43945176d95125b24b",
  "state":null,
  "propertySources":[
    {
      "name":"https://github.com/ndgndg91/hello-config/TEST-APPLICATION/application.yaml",
      "source":{
        "spring.application.name":"test-application",
        "test.value":1
      }
    }
  ]
}                                                                                                                                                 
```

```bash
curl localhost:8888/TEST-APPLICATION/default/main
{
  "name":"TEST-APPLICATION",
  "profiles":["default"],
  "label":"main",
  "version":"bbf8144346f5525813ed0f43945176d95125b24b",
  "state":null,
  "propertySources":[
    {
      "name":"https://github.com/ndgndg91/hello-config/TEST-APPLICATION/application.yaml",
      "source":{
        "spring.application.name":"test-application",
        "test.value":1
      }
    }
  ]
}
```