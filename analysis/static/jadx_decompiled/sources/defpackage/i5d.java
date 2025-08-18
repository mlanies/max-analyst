package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i5d {
    public static final i5d a;
    public static final i5d b;
    public static final i5d c;
    public static final /* synthetic */ i5d[] o;

    static {
        i5d i5dVar = new i5d("HideKeyboard", 0);
        a = i5dVar;
        i5d i5dVar2 = new i5d("SendMessage", 1);
        b = i5dVar2;
        i5d i5dVar3 = new i5d("SendMessageWithDisabling", 2);
        c = i5dVar3;
        o = new i5d[]{i5dVar, i5dVar2, i5dVar3};
    }

    public static i5d valueOf(String str) {
        return (i5d) Enum.valueOf(i5d.class, str);
    }

    public static i5d[] values() {
        return (i5d[]) o.clone();
    }
}
