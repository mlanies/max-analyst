package defpackage;

import android.util.TypedValue;
import android.widget.TextView;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes2.dex */
public final class vqe implements sx3 {
    public final /* synthetic */ ContextScope a;
    public final TextView b;
    public final t4f c;
    public final float o;

    public vqe(TextView textView, t4f t4fVar) {
        hde hdeVarA = f46.a();
        jd4 jd4Var = ql4.a;
        this.a = new ContextScope(hdeVarA.plus(MainDispatcherLoader.dispatcher));
        this.b = textView;
        this.c = t4fVar;
        this.o = textView.getTextSize();
        if (textView.isAttachedToWindow()) {
            textView.addOnAttachStateChangeListener(new sqe(textView, this, 1));
            return;
        }
        try {
            CancellationException cancellationException = new CancellationException("onDetach");
            cancellationException.initCause(null);
            j1e.i(this, cancellationException);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [rg7] */
    /* JADX WARN: Type inference failed for: r1v9, types: [njc] */
    public final void a() {
        vqe njcVar;
        t4f t4fVar = this.c;
        float fFloatValue = ((Number) t4fVar.a.getValue()).floatValue();
        TextView textView = this.b;
        textView.getContext();
        textView.setTextSize(0, TypedValue.applyDimension(2, fFloatValue, fk4.d().getDisplayMetrics()) + this.o);
        if (!textView.isAttachedToWindow()) {
            textView.addOnAttachStateChangeListener(new sqe(textView, this, 0));
            return;
        }
        zn5 zn5Var = new zn5(new ap8(t4fVar.a, this, 15), new tqe(this, null), 5);
        try {
            njcVar = lnf.b(textView);
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (!(njcVar instanceof njc)) {
            this = njcVar;
        }
        od2.L(zn5Var, this);
    }

    @Override // defpackage.sx3
    public final lx3 getCoroutineContext() {
        return this.a.getCoroutineContext();
    }
}
