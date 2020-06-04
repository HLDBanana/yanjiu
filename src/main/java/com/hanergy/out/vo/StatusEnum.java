package com.hanergy.out.vo;

public enum StatusEnum {
    DEVICE_RENT(0, "失效"), DEVICE_RETURN(1, "生效");

    private Integer code;
    private String type;

    StatusEnum(int code, String type) {
        this.code = code;
        this.type = type;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static String getType(Integer operatorId) {
        for (StatusEnum adConfigByEnum : StatusEnum.values()) {
            if (operatorId.intValue() == adConfigByEnum.getCode().intValue()) {
                return adConfigByEnum.getType();
            }
        }
        return "";
    }
}
