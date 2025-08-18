package defpackage;

import android.view.View;
import androidx.fragment.app.a;

/* loaded from: classes.dex */
public final class v06 extends br7 {
    public final /* synthetic */ a t0;

    public v06(a aVar) {
        this.t0 = aVar;
    }

    @Override // defpackage.br7
    public final View J(int i) {
        a aVar = this.t0;
        View view = aVar.U0;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException(rh4.i("Fragment ", aVar, " does not have a view"));
    }

    @Override // defpackage.br7
    public final boolean K() {
        return this.t0.U0 != null;
    }
}
