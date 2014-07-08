package cn.memedai.operation.domain.member;

import org.apache.commons.lang.StringUtils;

/**
 * Created by dell on 14-6-23.
 */
public enum SexEnum {
    MALE("男"),
    FEMALE("女");

    private final String name;

    SexEnum(String name) {
        this.name = name;
    }

    public static SexEnum fromName(final String name) {
        for (SexEnum se : values()) {
            if (name.equalsIgnoreCase(StringUtils.trim(se.name))) {
                return se;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}