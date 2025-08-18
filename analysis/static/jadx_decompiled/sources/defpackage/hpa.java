package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.fragment.app.a;

/* loaded from: classes.dex */
public abstract class hpa {
    public final DataSetObservable a = new DataSetObservable();
    public DataSetObserver b;

    public abstract void a(ViewGroup viewGroup, int i, a aVar);

    public abstract int b();

    public abstract int c(a aVar);

    public final void d() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.notifyChanged();
    }

    public abstract void e(Parcelable parcelable, ClassLoader classLoader);

    public abstract void f(ViewGroup viewGroup);
}
