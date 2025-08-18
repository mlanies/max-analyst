package one.me.complaintbottomsheet;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bc7;
import defpackage.da3;
import defpackage.dy7;
import defpackage.fa3;
import defpackage.fg7;
import defpackage.fs;
import defpackage.gh7;
import defpackage.ha3;
import defpackage.hn2;
import defpackage.hob;
import defpackage.je7;
import defpackage.k4a;
import defpackage.k56;
import defpackage.khe;
import defpackage.kpa;
import defpackage.ma3;
import defpackage.mqc;
import defpackage.nec;
import defpackage.ng3;
import defpackage.o72;
import defpackage.oa3;
import defpackage.od2;
import defpackage.p7b;
import defpackage.pk;
import defpackage.pnf;
import defpackage.ti2;
import defpackage.tu0;
import defpackage.w7c;
import defpackage.z84;
import defpackage.zn5;
import kotlin.Metadata;
import one.me.complaintbottomsheet.ComplaintBottomSheet;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/complaintbottomsheet/ComplaintBottomSheet;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "(J)V", "complaint-bottomsheet_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class ComplaintBottomSheet extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] X;
    public final fs a;
    public final je7 b;
    public final khe c;
    public final khe o;

    static {
        hob hobVar = new hob(ComplaintBottomSheet.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        nec.a.getClass();
        X = new bc7[]{hobVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComplaintBottomSheet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        oa3 oa3Var = (oa3) this.b.getValue();
        oa3Var.getClass();
        da3[] da3VarArrValues = da3.values();
        da3 da3Var = (i < 0 || i > da3VarArrValues.length + (-1)) ? null : da3VarArrValues[i];
        if (da3Var == null) {
            return;
        }
        k4a k4aVar = (k4a) ((pk) oa3Var.c.getValue());
        long j = oa3Var.b;
        if (k4aVar.o(j)) {
            k4a.w(k4aVar, new o72(((p7b) k4aVar.y()).a.o(), j, da3Var));
        }
        pnf.o(oa3Var.X, ma3.a);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new ActionBar.LayoutParams(-1, -1));
        frameLayout.setAlpha(0.0f);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        je7 je7Var = this.b;
        w7c w7cVar = ((oa3) je7Var.getValue()).o;
        gh7 gh7VarQ = getViewLifecycleOwner().Q();
        fg7 fg7Var = fg7.o;
        od2.L(new mqc(new ha3(tu0.g(w7cVar, gh7VarQ, fg7Var), null, this)), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((oa3) je7Var.getValue()).X, getViewLifecycleOwner().Q(), fg7Var), new fa3(null, this), 5), getViewLifecycleScope());
    }

    public /* synthetic */ ComplaintBottomSheet(Bundle bundle, int i, z84 z84Var) {
        this((i & 1) != 0 ? null : bundle);
    }

    public ComplaintBottomSheet(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new fs(Long.class, "chat_id");
        final int i = 0;
        this.b = createViewModelLazy(oa3.class, new ti2(23, new k56(this) { // from class: ea3
            public final /* synthetic */ ComplaintBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ComplaintBottomSheet complaintBottomSheet = this.b;
                switch (i) {
                    case 0:
                        bc7 bc7Var = ComplaintBottomSheet.X[0];
                        return new oa3(((Number) complaintBottomSheet.a.a(complaintBottomSheet)).longValue());
                    default:
                        bc7[] bc7VarArr = ComplaintBottomSheet.X;
                        wha whaVar = new wha(complaintBottomSheet);
                        whaVar.e(new kia(woc.z));
                        whaVar.g(new eqe(maa.b));
                        return whaVar;
                }
            }
        }));
        this.c = new khe(new hn2(15));
        final int i2 = 1;
        this.o = new khe(new k56(this) { // from class: ea3
            public final /* synthetic */ ComplaintBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ComplaintBottomSheet complaintBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        bc7 bc7Var = ComplaintBottomSheet.X[0];
                        return new oa3(((Number) complaintBottomSheet.a.a(complaintBottomSheet)).longValue());
                    default:
                        bc7[] bc7VarArr = ComplaintBottomSheet.X;
                        wha whaVar = new wha(complaintBottomSheet);
                        whaVar.e(new kia(woc.z));
                        whaVar.g(new eqe(maa.b));
                        return whaVar;
                }
            }
        });
    }

    public ComplaintBottomSheet(long j) {
        this(dy7.g(new kpa("chat_id", Long.valueOf(j))));
    }
}
