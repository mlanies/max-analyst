package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class zof {
    public static final zof X;
    public static final zof Y;
    public static final /* synthetic */ zof[] Z;
    public static final zof b;
    public static final zof c;
    public static final zof o;
    public static final /* synthetic */ v25 s0;
    public final Integer a;

    static {
        zof zofVar = new zof("None", 0, null);
        b = zofVar;
        zof zofVar2 = new zof("Timer", 1, Integer.valueOf(woc.X));
        c = zofVar2;
        zof zofVar3 = new zof("Send", 2, Integer.valueOf(woc.k));
        o = zofVar3;
        zof zofVar4 = new zof("Seen", 3, Integer.valueOf(woc.i));
        X = zofVar4;
        zof zofVar5 = new zof("Error", 4, Integer.valueOf(woc.H));
        Y = zofVar5;
        zof[] zofVarArr = {zofVar, zofVar2, zofVar3, zofVar4, zofVar5};
        Z = zofVarArr;
        s0 = new v25(zofVarArr);
    }

    public zof(String str, int i, Integer num) {
        this.a = num;
    }

    public static zof valueOf(String str) {
        return (zof) Enum.valueOf(zof.class, str);
    }

    public static zof[] values() {
        return (zof[]) Z.clone();
    }
}
