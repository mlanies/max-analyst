package defpackage;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class ioa extends ldc {
    public final int a;
    public final float b = 0.5f;
    public final float c = 0.5f;

    public ioa(int i) {
        this.a = i;
    }

    @Override // defpackage.ldc
    public final EdgeEffect a(RecyclerView recyclerView, int i) {
        return new hoa(i, this, recyclerView, recyclerView.getContext());
    }
}
