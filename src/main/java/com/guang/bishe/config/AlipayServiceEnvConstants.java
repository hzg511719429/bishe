package com.guang.bishe.config;

/**
 * 支付宝服务窗环境常量（demo中常量只是参考，需要修改成自己的常量值）
 *
 * @ClassName: AlipayServiceEnvConstants
 * @Author: guang
 * @CreateDate: 2019/3/27 21:45
 */
public class AlipayServiceEnvConstants {

    /**
     * 支付宝公钥-从支付宝生活号详情页面获取
     */
    public static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2AhhpH+QllDPJzGU+8PIFjaij2AfYf82m9cYtqTWJoz4NGkXDKI6ebApfY4ZTAlFjyUZsr3hqoK0Zn2ke4E9v4g+dBSReH0iJE3wjxZCg6/l7ZnCBR4W5wMNkmXHJX8rykawEFecy/7RU5JVlE1bSFvMxtfhOAMyufPxmMl2eQy2JQw3w/INq61uVo6VQ8dSFzSBZgjkActZgJzt3wGUwxrOso6Dos85gneAFfMXc70xf+0ikvGra1xlwxroOe7Dh2fyMNJ6nEsoKP9q0De924ewb2ju+XL6DVSZsqmegzmYHktOEDcWXHDWq1bkic61OLWWVH7SlgOJAQz2hrthjwIDAQAB";

    /**签名编码-视支付宝服务窗要求*/
    //public static final String SIGN_CHARSET      = "GBK";

    /**
     * 字符编码-传递给支付宝的数据编码
     */
    public static final String CHARSET = "utf-8";

    /**
     * 签名类型-视支付宝服务窗要求
     */
    public static final String SIGN_TYPE = "RSA2";

    /**
     * 开发者账号PID
     */
    public static final String PARTNER = "";

    /**
     * 服务窗appId
     */
    //TODO !!!! 注：该appId必须设为开发者自己的生活号id
    public static final String APP_ID = "2016092700609012";

    //TODO !!!! 注：该私钥为测试账号私钥  开发者必须设置自己的私钥 , 否则会存在安全隐患
    public static final String PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCGo9KpPI9SEZlkaKQ/ebQ5WBA99IQNSkP2mUk4Z0lgyIsjeOVKjCsqKZYqmgnvJq86JntrgTfaaoE5GXjiqivq3TNN0sVfnvuc6+OkDUZ63MDee5fGI8cMGxajz6cYxFofOPszgDCgKMaWq1y/FkT1BRrx35+AlN1QPx0HMkhEHyPHuEmxkMtQ7Jl24N8ooqZjKAfITt1H/xV3IjMG37fsGfbxOyW4txb0HML335IruqIWC9XnXfJ1yASCx4fIFLmdWUTW/vZqMbyqBQnsTfaNBp29iwkRJT+EydresSwf3n43ToCPnmWvSDoLvsZo7gax6meh8+TXOkzQEDuXRcMHAgMBAAECggEAPi7TUI5DsyelrJYXpalT71gYyERx6KFwGihZhM9POH/mow9m9rMeDG8Ah9R02hsHutejENexMBMYc4KsLiNh/SsEUuERf0Qx+RuJG292KbBi814pjr1fZNvt7OIuzmWBKgJrIjIGQzIR5exm/WoPlwowk50wUXZvcGx1v6kdbzg2zU0c8Fzl0Jnqv9bGZHsYjuijESAsJmQg60mdSQFcWbMUmRavAtiTJ6/c5ABUUch4Cj0RnHJ48lJ1ECk2LIP98Q8OVDI5wuJ/rcyUpoGa0WvieZ3BsGCWJrgcLaThNjBAURiKrQ/VtelTJt/CC0kvjREm1McF9lRnXG4L1FWiAQKBgQDEiqOR+olxCEuIr4G6/QJtSegkxUDNYz+vwPkVyk9cns2XmlLOE0sr4Bg4B8Unlwq5obeBoTh76t7piko3MzZfmaeuY9cKmRsFmRP2wj4m2Rbsh6kC7RkRyowaJVVixhd6Zc2zWRmTyxTMCv2YZiclEOEPWfDH+pe44axrOFo+RwKBgQCvXyZKdjoDZIrGvdGBYaQ9es7xGsbni5EFTD9wGcNczGgYMPSFTiQLSH+DkFnQKGMYkrv0hOb/wT+VNtItYe82akuGQETug4uub81LbuOVN5WIf7v4SSzFOqUdvqk8URIH99w/wGSoKbK6J7QUTqqkaNZLaL63hrfGkb+Ydi71QQKBgEJ9UGbDJhoKH1uHXFEA5QBJ/3HpFUomaFYx51I61exUgOLnv1md51FZh3f1EPqau3MfRXBiNTSeuXiyYvcXqS5gUfzKI+ae8yhKqBlTjykfSgUMw92Mjm2ZYxo5RRCcSTcMF7Gz09ZO3qNEmJQlAtskQa8q0y0kFo3iMq03LDhjAoGAX1fNi4IHPDz3LeGY+0xIbJxN0csLBGteZpDzlFCNY/BFT5Gd/rNi6Td7C9341jB+36c2xFNU+wrnNIpfbgjmcqELemuKjlm6IRXreO1KkZ9sjo9TdELkMj4V8rvraj1xHh/lAEvq7XnuD0Lypm+2Wjgc+VZzCXgWhcBLd+oY0YECgYBhiHWJ3CbDKJ860HTBU97CHjXxC5C+HQILS6As35msFgN1TczMLBr+K/JOBvmOejtv71Y3HyxEZ2Mu+A+7vFr6PDLeFICBXrsFw49QHi3xgw968eg6DdiB0NBA2l/ycFE50wtK2MeYBAsvVA0KfjikXRAmImjcn206ZY5MLJZg5Q==";
    //TODO !!!! 注：该公钥为测试账号公钥  开发者必须设置自己的公钥 ,否则会存在安全隐患
    //public static final String PUBLIC_KEY        = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhqPSqTyPUhGZZGikP3m0OVgQPfSEDUpD9plJOGdJYMiLI3jlSowrKimWKpoJ7yavOiZ7a4E32mqBORl44qor6t0zTdLFX577nOvjpA1GetzA3nuXxiPHDBsWo8+nGMRaHzj7M4AwoCjGlqtcvxZE9QUa8d+fgJTdUD8dBzJIRB8jx7hJsZDLUOyZduDfKKKmYygHyE7dR/8VdyIzBt+37Bn28TsluLcW9BzC99+SK7qiFgvV513ydcgEgseHyBS5nVlE1v72ajG8qgUJ7E32jQadvYsJESU/hMna3rEsH95+N06Aj55lr0g6C77GaO4GsepnofPk1zpM0BA7l0XDBwIDAQAB";
    /**
     * 支付宝网关
     */
    public static final String ALIPAY_GATEWAY = "https://openapi.alipaydev.com/gateway.do";

    /**
     * 授权访问令牌的授权类型
     */
    public static final String GRANT_TYPE = "authorization_code";

}
