package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fza {
    public static final fza a;
    public static final fza b;
    public static final fza c;
    public static final /* synthetic */ fza[] o;

    static {
        fza fzaVar = new fza("CHAT", 0);
        a = fzaVar;
        fza fzaVar2 = new fza("CONTACT", 1);
        b = fzaVar2;
        fza fzaVar3 = new fza("PHONE", 2);
        c = fzaVar3;
        o = new fza[]{fzaVar, fzaVar2, fzaVar3};
    }

    public static fza valueOf(String str) {
        return (fza) Enum.valueOf(fza.class, str);
    }

    public static fza[] values() {
        return (fza[]) o.clone();
    }
}
