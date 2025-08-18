package defpackage;

import android.os.Looper;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class imf implements View.OnClickListener, zl4 {
    public final AtomicBoolean a = new AtomicBoolean();
    public final View b;
    public final f2a c;

    public imf(View view, f2a f2aVar) {
        this.b = view;
        this.c = f2aVar;
    }

    @Override // defpackage.zl4
    public final void g() {
        if (this.a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.b.setOnClickListener(null);
            } else {
                ce.a().b(new nn6(8, this));
            }
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.a.get();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a.get()) {
            return;
        }
        this.c.e(e5f.a);
    }
}
