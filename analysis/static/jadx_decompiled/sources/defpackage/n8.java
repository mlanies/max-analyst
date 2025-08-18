package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class n8 implements m56 {
    public static final n8 a = new n8();

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        return String.valueOf(((WeakReference) obj).get());
    }
}
