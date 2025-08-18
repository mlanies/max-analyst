package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class lwc {
    public static final lwc a;
    public static final lwc b;
    public static final lwc c;
    public static final /* synthetic */ lwc[] o;

    static {
        lwc lwcVar = new lwc("UNREAD", 0);
        a = lwcVar;
        lwc lwcVar2 = new lwc("MENTION", 1);
        b = lwcVar2;
        lwc lwcVar3 = new lwc("REACTION", 2);
        c = lwcVar3;
        o = new lwc[]{lwcVar, lwcVar2, lwcVar3};
    }

    public static lwc valueOf(String str) {
        return (lwc) Enum.valueOf(lwc.class, str);
    }

    public static lwc[] values() {
        return (lwc[]) o.clone();
    }
}
