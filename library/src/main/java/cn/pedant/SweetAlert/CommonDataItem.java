package cn.pedant.SweetAlert;

public class CommonDataItem implements Listable {

    private int resId = 0;
    private String code;
    private String description;

    public CommonDataItem(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public CommonDataItem(int resId, String code, String description) {
        this.resId = resId;
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    @Override
    public String getLabel() {
        return description;
    }

    @Override
    public int getIcon() {
        return resId;
    }
}
