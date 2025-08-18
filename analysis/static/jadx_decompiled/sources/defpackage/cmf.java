package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public interface cmf {
    default View getPreviewView() {
        return null;
    }

    default boolean j() {
        return false;
    }

    boolean m();

    void o(tlf tlfVar, o00 o00Var, long j, boolean z, boolean z2);

    boolean s();

    void setVideoClickListener(a66 a66Var);

    void setVideoLongClickListener(a66 a66Var);

    void u();
}
