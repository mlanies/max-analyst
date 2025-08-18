package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class olf {
    public static final olf X;
    public static final /* synthetic */ olf[] Y;
    public static final olf a;
    public static final olf b;
    public static final olf c;
    public static final olf o;

    static {
        olf olfVar = new olf("VIDEO", 0);
        a = olfVar;
        olf olfVar2 = new olf("SCREEN_CAPTURE", 1);
        b = olfVar2;
        olf olfVar3 = new olf("ANIMOJI", 2);
        c = olfVar3;
        olf olfVar4 = new olf("MOVIE", 3);
        o = olfVar4;
        olf olfVar5 = new olf("STREAM", 4);
        X = olfVar5;
        Y = new olf[]{olfVar, olfVar2, olfVar3, olfVar4, olfVar5};
    }

    public static olf valueOf(String str) {
        return (olf) Enum.valueOf(olf.class, str);
    }

    public static olf[] values() {
        return (olf[]) Y.clone();
    }
}
