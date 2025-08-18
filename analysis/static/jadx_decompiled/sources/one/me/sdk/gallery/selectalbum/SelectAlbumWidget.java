package one.me.sdk.gallery.selectalbum;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.bc7;
import defpackage.d6b;
import defpackage.dy7;
import defpackage.f6b;
import defpackage.fg7;
import defpackage.fs;
import defpackage.g4d;
import defpackage.hob;
import defpackage.iba;
import defpackage.je7;
import defpackage.k56;
import defpackage.kpa;
import defpackage.la8;
import defpackage.nec;
import defpackage.od2;
import defpackage.oec;
import defpackage.q3d;
import defpackage.qm0;
import defpackage.suc;
import defpackage.t3d;
import defpackage.tu0;
import defpackage.u3c;
import defpackage.z5b;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/sdk/gallery/selectalbum/SelectAlbumWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "parentScope", "(Ljava/lang/String;Lz84;)V", "t9", "media-gallery-widget_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class SelectAlbumWidget extends Widget {
    public static final /* synthetic */ bc7[] Y;
    public final qm0 X;
    public final je7 a;
    public final je7 b;
    public final qm0 c;
    public final qm0 o;

    static {
        hob hobVar = new hob(SelectAlbumWidget.class, "parentScope", "getParentScope-IluPPks()Ljava/lang/String;", 0);
        oec oecVar = nec.a;
        Y = new bc7[]{hobVar, zr6.e(oecVar, SelectAlbumWidget.class, "albumAdapter", "getAlbumAdapter()Lone/me/sdk/gallery/selectalbum/SelectedAlbumAdapter;", 0), zr6.f(SelectAlbumWidget.class, "contentContainer", "getContentContainer()Lone/me/sdk/gallery/selectalbum/SelectedAlbumRecyclerView;", 0, oecVar), zr6.f(SelectAlbumWidget.class, "popupLayout", "getPopupLayout()Lone/me/sdk/uikit/common/views/PopupLayout;", 0, oecVar)};
    }

    public SelectAlbumWidget(String str, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public final g4d m0() {
        bc7 bc7Var = Y[2];
        return (g4d) this.o.getValue();
    }

    public final f6b n0() {
        bc7 bc7Var = Y[3];
        return (f6b) this.X.getValue();
    }

    public final q3d o0() {
        return (q3d) this.a.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return n0();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(o0().X, getViewLifecycleOwner().Q(), fg7.o), new t3d(null, this), 5), getViewLifecycleScope());
    }

    public final void p0() {
        View viewF;
        if (n0().getScrollState() != d6b.a) {
            n0().j(true);
            return;
        }
        z5b callback = n0().getCallback();
        if (callback == null || (viewF = callback.f()) == null || viewF.getHeight() != 0) {
            n0().k();
        } else {
            n0().post(new u3c(11, this));
        }
    }

    public SelectAlbumWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        fs fsVar = new fs(suc.class, Widget.ARG_SCOPE_ID);
        bc7 bc7Var = Y[0];
        this.a = m41getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, q3d.class, null);
        this.b = la8.a.getAccessor().d(iba.class);
        final int i = 0;
        this.c = binding(new k56(this) { // from class: r3d
            public final /* synthetic */ SelectAlbumWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                Continuation continuation = null;
                int i2 = 3;
                SelectAlbumWidget selectAlbumWidget = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = SelectAlbumWidget.Y;
                        f4d f4dVar = new f4d(new bqc(3, selectAlbumWidget), ((iba) selectAlbumWidget.b.getValue()).a());
                        od2.L(new zn5(tu0.g(selectAlbumWidget.o0().s0, selectAlbumWidget.getViewLifecycleOwner().Q(), fg7.o), new s3d(null, f4dVar), 5), selectAlbumWidget.getViewLifecycleScope());
                        return f4dVar;
                    case 1:
                        bc7[] bc7VarArr2 = SelectAlbumWidget.Y;
                        g4d g4dVar = new g4d(selectAlbumWidget.getContext(), null);
                        g4dVar.setId(fga.d);
                        g4dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        g4dVar.getContext();
                        g4dVar.setLayoutManager(new LinearLayoutManager());
                        bc7 bc7Var2 = SelectAlbumWidget.Y[1];
                        g4dVar.setAdapter((f4d) selectAlbumWidget.c.getValue());
                        g4dVar.setOutlineProvider(new xq0(0, fk4.d().getDisplayMetrics().density * 20.0f));
                        v3c.y(new r1b(i2, continuation, 12), g4dVar);
                        return g4dVar;
                    default:
                        bc7[] bc7VarArr3 = SelectAlbumWidget.Y;
                        f6b f6bVar = new f6b(selectAlbumWidget.getContext());
                        f6bVar.setStackFromBottom(false);
                        f6bVar.setCallback(new t9(selectAlbumWidget, 4));
                        f6bVar.addView(selectAlbumWidget.m0());
                        v3c.y(new br(i2, continuation, 14), f6bVar);
                        return f6bVar;
                }
            }
        });
        final int i2 = 1;
        this.o = binding(new k56(this) { // from class: r3d
            public final /* synthetic */ SelectAlbumWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                Continuation continuation = null;
                int i22 = 3;
                SelectAlbumWidget selectAlbumWidget = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = SelectAlbumWidget.Y;
                        f4d f4dVar = new f4d(new bqc(3, selectAlbumWidget), ((iba) selectAlbumWidget.b.getValue()).a());
                        od2.L(new zn5(tu0.g(selectAlbumWidget.o0().s0, selectAlbumWidget.getViewLifecycleOwner().Q(), fg7.o), new s3d(null, f4dVar), 5), selectAlbumWidget.getViewLifecycleScope());
                        return f4dVar;
                    case 1:
                        bc7[] bc7VarArr2 = SelectAlbumWidget.Y;
                        g4d g4dVar = new g4d(selectAlbumWidget.getContext(), null);
                        g4dVar.setId(fga.d);
                        g4dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        g4dVar.getContext();
                        g4dVar.setLayoutManager(new LinearLayoutManager());
                        bc7 bc7Var2 = SelectAlbumWidget.Y[1];
                        g4dVar.setAdapter((f4d) selectAlbumWidget.c.getValue());
                        g4dVar.setOutlineProvider(new xq0(0, fk4.d().getDisplayMetrics().density * 20.0f));
                        v3c.y(new r1b(i22, continuation, 12), g4dVar);
                        return g4dVar;
                    default:
                        bc7[] bc7VarArr3 = SelectAlbumWidget.Y;
                        f6b f6bVar = new f6b(selectAlbumWidget.getContext());
                        f6bVar.setStackFromBottom(false);
                        f6bVar.setCallback(new t9(selectAlbumWidget, 4));
                        f6bVar.addView(selectAlbumWidget.m0());
                        v3c.y(new br(i22, continuation, 14), f6bVar);
                        return f6bVar;
                }
            }
        });
        final int i3 = 2;
        this.X = binding(new k56(this) { // from class: r3d
            public final /* synthetic */ SelectAlbumWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                Continuation continuation = null;
                int i22 = 3;
                SelectAlbumWidget selectAlbumWidget = this.b;
                switch (i3) {
                    case 0:
                        bc7[] bc7VarArr = SelectAlbumWidget.Y;
                        f4d f4dVar = new f4d(new bqc(3, selectAlbumWidget), ((iba) selectAlbumWidget.b.getValue()).a());
                        od2.L(new zn5(tu0.g(selectAlbumWidget.o0().s0, selectAlbumWidget.getViewLifecycleOwner().Q(), fg7.o), new s3d(null, f4dVar), 5), selectAlbumWidget.getViewLifecycleScope());
                        return f4dVar;
                    case 1:
                        bc7[] bc7VarArr2 = SelectAlbumWidget.Y;
                        g4d g4dVar = new g4d(selectAlbumWidget.getContext(), null);
                        g4dVar.setId(fga.d);
                        g4dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        g4dVar.getContext();
                        g4dVar.setLayoutManager(new LinearLayoutManager());
                        bc7 bc7Var2 = SelectAlbumWidget.Y[1];
                        g4dVar.setAdapter((f4d) selectAlbumWidget.c.getValue());
                        g4dVar.setOutlineProvider(new xq0(0, fk4.d().getDisplayMetrics().density * 20.0f));
                        v3c.y(new r1b(i22, continuation, 12), g4dVar);
                        return g4dVar;
                    default:
                        bc7[] bc7VarArr3 = SelectAlbumWidget.Y;
                        f6b f6bVar = new f6b(selectAlbumWidget.getContext());
                        f6bVar.setStackFromBottom(false);
                        f6bVar.setCallback(new t9(selectAlbumWidget, 4));
                        f6bVar.addView(selectAlbumWidget.m0());
                        v3c.y(new br(i22, continuation, 14), f6bVar);
                        return f6bVar;
                }
            }
        });
    }
}
