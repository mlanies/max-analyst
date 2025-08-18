package defpackage;

import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class os implements kde, b66 {
    public static final os a;
    public static final /* synthetic */ os[] b;

    static {
        os osVar = new os("INSTANCE", 0);
        a = osVar;
        b = new os[]{osVar};
    }

    public static os valueOf(String str) {
        return (os) Enum.valueOf(os.class, str);
    }

    public static os[] values() {
        return (os[]) b.clone();
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public final Object mo131apply(Object obj) {
        return new ArrayList();
    }

    @Override // defpackage.kde
    public final Object get() {
        return new ArrayList();
    }
}
