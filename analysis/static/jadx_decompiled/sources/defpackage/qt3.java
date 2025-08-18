package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Collection;

/* loaded from: classes2.dex */
public interface qt3 {
    qt3 I(Collection collection);

    default qt3 L(float f, float f2) {
        return this;
    }

    qt3 R(float f);

    qt3 S(Bundle bundle);

    default qt3 U(iqe iqeVar) {
        return this;
    }

    qt3 Y(View view);

    rt3 build();

    default qt3 d0() {
        return this;
    }

    qt3 r();

    qt3 s();

    qt3 w(Rect rect, float f);

    default qt3 y() {
        return this;
    }
}
