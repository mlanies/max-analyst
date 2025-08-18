package one.me.sdk.sections;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bc7;
import defpackage.bkg;
import defpackage.fk4;
import defpackage.fka;
import defpackage.hob;
import defpackage.lm4;
import defpackage.mfd;
import defpackage.nd3;
import defpackage.nec;
import defpackage.pga;
import defpackage.q1d;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.tu0;
import defpackage.y51;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/sdk/sections/SectionRecyclerWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "sections-widget_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public abstract class SectionRecyclerWidget extends Widget {
    public static final /* synthetic */ bc7[] c;
    public final q7c a;
    public final bkg b;

    static {
        hob hobVar = new hob(SectionRecyclerWidget.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        nec.a.getClass();
        c = new bc7[]{hobVar};
    }

    public SectionRecyclerWidget() {
        super(null, 0, 3, null);
        this.a = viewBinding(pga.o);
        this.b = new bkg(24, this);
    }

    /* renamed from: m0 */
    public abstract y51 getA0();

    /* renamed from: n0 */
    public abstract mfd getZ0();

    public final RecyclerView o0(int i) {
        nd3 nd3Var = new nd3(getZ0(), getA0());
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setId(pga.o);
        recyclerView.setAdapter(nd3Var);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        float f = 12;
        recyclerView.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        fka fkaVarJ = qp4.u0.j(recyclerView);
        bkg bkgVar = this.b;
        recyclerView.j(new q1d(fkaVarJ, bkgVar, null, 12));
        recyclerView.j(new lm4(bkgVar, i));
        return recyclerView;
    }
}
