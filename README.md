````java
@Bean
public PatternServiceRouteMapper serviceRouteMapper() {
    return new PatternServiceRouteMapper(
        "(?<name>^.+)-(?<version>v.+$)",
        "${version}/${name}");
}
````
```html
The preceding example means that a serviceId of myusers-v1 is mapped to route /v1/myusers/**. Any regular expression is accepted, but all named groups must be present in both servicePattern and routePattern. If servicePattern does not match a serviceId, the default behavior is used. In the preceding example, a serviceId of myusers is mapped to the "/myusers/**" route (with no version detected). This feature is disabled by default and only applies to discovered services
前面的示例意味着myusers-v1的serviceId映射到route /v1/myusers/**。任何正则表达式都可以接受，但是所有命名组必须同时出现在servicePattern和routePattern中。如果servicePattern不匹配serviceId，则使用默认行为。在前面的示例中，myusers的serviceId映射到“/myusers/**”路由(没有检测到版本)。默认情况下禁用此功能，仅适用于已发现的服务

```