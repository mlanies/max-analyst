package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ui5 {
    public static final ui5 a;
    public static final ui5 b;
    public static final /* synthetic */ ui5[] c;

    static {
        ui5 ui5Var = new ui5("Arrow", 0);
        a = ui5Var;
        ui5 ui5Var2 = new ui5("Progress", 1);
        b = ui5Var2;
        c = new ui5[]{ui5Var, ui5Var2};
    }

    public static ui5 valueOf(String str) {
        return (ui5) Enum.valueOf(ui5.class, str);
    }

    public static ui5[] values() {
        return (ui5[]) c.clone();
    }
}
