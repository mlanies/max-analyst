package defpackage;

import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes.dex */
public final class t4d extends dec {
    public static final /* synthetic */ int L0 = 0;
    public final p58 F0;
    public final OneMeDraweeView G0;
    public final View H0;
    public q4d I0;
    public Uri J0;
    public Uri K0;

    public t4d(p58 p58Var, OneMeDraweeView oneMeDraweeView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout) {
        super(frameLayout);
        this.F0 = p58Var;
        this.G0 = oneMeDraweeView;
        this.H0 = appCompatImageView2;
        final int i = 0;
        tu0.K(oneMeDraweeView, 300L, new View.OnClickListener(this) { // from class: s4d
            public final /* synthetic */ t4d b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        t4d t4dVar = this.b;
                        q4d q4dVar = t4dVar.I0;
                        if (q4dVar != null) {
                            p58 p58Var2 = t4dVar.F0;
                            p58Var2.t0.n(new g48(q4dVar, ((List) p58Var2.x0.getValue()).indexOf(q4dVar)));
                            break;
                        }
                        break;
                    default:
                        t4d t4dVar2 = this.b;
                        q4d q4dVar2 = t4dVar2.I0;
                        if (q4dVar2 != null) {
                            t4dVar2.F0.t0.n(new c48(q4dVar2));
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        tu0.K(appCompatImageView, 300L, new View.OnClickListener(this) { // from class: s4d
            public final /* synthetic */ t4d b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        t4d t4dVar = this.b;
                        q4d q4dVar = t4dVar.I0;
                        if (q4dVar != null) {
                            p58 p58Var2 = t4dVar.F0;
                            p58Var2.t0.n(new g48(q4dVar, ((List) p58Var2.x0.getValue()).indexOf(q4dVar)));
                            break;
                        }
                        break;
                    default:
                        t4d t4dVar2 = this.b;
                        q4d q4dVar2 = t4dVar2.I0;
                        if (q4dVar2 != null) {
                            t4dVar2.F0.t0.n(new c48(q4dVar2));
                            break;
                        }
                        break;
                }
            }
        });
    }
}
