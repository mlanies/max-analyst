package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class sqe implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ vqe c;

    public /* synthetic */ sqe(View view, vqe vqeVar, int i) {
        this.a = i;
        this.b = view;
        this.c = vqeVar;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [njc] */
    /* JADX WARN: Type inference failed for: r4v10, types: [rg7] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        vqe njcVar;
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                vqe vqeVar = this.c;
                zn5 zn5Var = new zn5(new ap8(vqeVar.c.a, vqeVar, 15), new tqe(vqeVar, null), 5);
                try {
                    njcVar = lnf.b(vqeVar.b);
                } catch (Throwable th) {
                    njcVar = new njc(th);
                }
                if (!(njcVar instanceof njc)) {
                    vqeVar = njcVar;
                }
                od2.L(zn5Var, vqeVar);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                vqe vqeVar = this.c;
                try {
                    CancellationException cancellationException = new CancellationException("onDetach");
                    cancellationException.initCause(null);
                    j1e.i(vqeVar, cancellationException);
                    break;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
