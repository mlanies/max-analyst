package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes.dex */
public final class i18 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ MaterialCalendar F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i18(MaterialCalendar materialCalendar, int i, int i2) {
        super(i, false);
        this.F = materialCalendar;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void I0(RecyclerView recyclerView, int i) {
        dp9 dp9Var = new dp9(recyclerView.getContext(), 1);
        dp9Var.a = i;
        J0(dp9Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void L0(zdc zdcVar, int[] iArr) {
        int i = this.E;
        MaterialCalendar materialCalendar = this.F;
        if (i == 0) {
            iArr[0] = materialCalendar.s1.getWidth();
            iArr[1] = materialCalendar.s1.getWidth();
        } else {
            iArr[0] = materialCalendar.s1.getHeight();
            iArr[1] = materialCalendar.s1.getHeight();
        }
    }
}
