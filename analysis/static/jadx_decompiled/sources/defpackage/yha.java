package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class yha {
    public static final yha X;
    public static final /* synthetic */ yha[] Y;
    public static final yha a;
    public static final yha b;
    public static final yha c;
    public static final yha o;

    static {
        yha yhaVar = new yha("TIMEOUT", 0);
        a = yhaVar;
        yha yhaVar2 = new yha("SWIPE", 1);
        b = yhaVar2;
        yha yhaVar3 = new yha("MANUAL", 2);
        c = yhaVar3;
        yha yhaVar4 = new yha("ROOT_VIEW_DETACHED", 3);
        o = yhaVar4;
        yha yhaVar5 = new yha("RIGHT_ELEMENT_CLICK", 4);
        X = yhaVar5;
        Y = new yha[]{yhaVar, yhaVar2, yhaVar3, yhaVar4, yhaVar5};
    }

    public static yha valueOf(String str) {
        return (yha) Enum.valueOf(yha.class, str);
    }

    public static yha[] values() {
        return (yha[]) Y.clone();
    }
}
