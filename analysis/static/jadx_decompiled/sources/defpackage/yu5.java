package defpackage;

import org.apache.http.client.methods.HttpDelete;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class yu5 {
    public static final yu5 a;
    public static final yu5 b;
    public static final /* synthetic */ yu5[] c;

    static {
        yu5 yu5Var = new yu5("EDIT", 0);
        a = yu5Var;
        yu5 yu5Var2 = new yu5(HttpDelete.METHOD_NAME, 1);
        b = yu5Var2;
        c = new yu5[]{yu5Var, yu5Var2};
    }

    public static yu5 valueOf(String str) {
        return (yu5) Enum.valueOf(yu5.class, str);
    }

    public static yu5[] values() {
        return (yu5[]) c.clone();
    }
}
