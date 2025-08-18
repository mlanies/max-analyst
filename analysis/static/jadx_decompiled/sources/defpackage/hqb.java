package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class hqb {
    public static final hqb a;
    public static final /* synthetic */ hqb[] b;

    static {
        hqb hqbVar = new hqb("DEFAULT", 0);
        a = hqbVar;
        hqb hqbVar2 = new hqb("UNMETERED_ONLY", 1);
        hqb hqbVar3 = new hqb("UNMETERED_OR_DAILY", 2);
        hqb hqbVar4 = new hqb("FAST_IF_RADIO_AWAKE", 3);
        hqb hqbVar5 = new hqb("NEVER", 4);
        hqb hqbVar6 = new hqb("UNRECOGNIZED", 5);
        b = new hqb[]{hqbVar, hqbVar2, hqbVar3, hqbVar4, hqbVar5, hqbVar6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, hqbVar);
        sparseArray.put(1, hqbVar2);
        sparseArray.put(2, hqbVar3);
        sparseArray.put(3, hqbVar4);
        sparseArray.put(4, hqbVar5);
        sparseArray.put(-1, hqbVar6);
    }

    public static hqb valueOf(String str) {
        return (hqb) Enum.valueOf(hqb.class, str);
    }

    public static hqb[] values() {
        return (hqb[]) b.clone();
    }
}
