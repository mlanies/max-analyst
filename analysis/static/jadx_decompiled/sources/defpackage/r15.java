package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class r15 extends tdc {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public final Object d;

    public r15(z15 z15Var, t15 t15Var) {
        this.a = 0;
        this.d = z15Var;
        this.c = t15Var;
        this.b = 1;
    }

    @Override // defpackage.tdc
    public void a(RecyclerView recyclerView, int i) {
        switch (this.a) {
            case 1:
                FastScroller fastScroller = (FastScroller) this.c;
                if (i == 0 && this.b != 0) {
                    gxc viewProvider = fastScroller.getViewProvider();
                    viewProvider.getClass();
                    if (viewProvider.a() != null) {
                        viewProvider.a().getClass();
                    }
                } else if (i != 0 && this.b == 0) {
                    gxc viewProvider2 = fastScroller.getViewProvider();
                    viewProvider2.getClass();
                    if (viewProvider2.a() != null) {
                        viewProvider2.a().getClass();
                    }
                }
                this.b = i;
                break;
        }
    }

    @Override // defpackage.tdc
    public final void b(RecyclerView recyclerView, final int i, final int i2) {
        switch (this.a) {
            case 0:
                final z15 z15Var = (z15) this.d;
                z15Var.post(new Runnable() { // from class: q15
                    @Override // java.lang.Runnable
                    public final void run() {
                        int iY0;
                        r15 r15Var = this;
                        t15 t15Var = (t15) r15Var.c;
                        if (i != 0 || i2 != 0) {
                            t15Var.getClass();
                        }
                        z15 z15Var2 = z15Var;
                        a layoutManager = z15Var2.getLayoutManager();
                        int iW0 = 0;
                        if (layoutManager instanceof StaggeredGridLayoutManager) {
                            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                            int i3 = staggeredGridLayoutManager.p;
                            int[] iArr = new int[i3];
                            for (int i4 = 0; i4 < staggeredGridLayoutManager.p; i4++) {
                                qxd qxdVar = staggeredGridLayoutManager.q[i4];
                                boolean z = ((StaggeredGridLayoutManager) qxdVar.f).w;
                                ArrayList arrayList = (ArrayList) qxdVar.e;
                                iArr[i4] = z ? qxdVar.g(0, arrayList.size(), true, false) : qxdVar.g(arrayList.size() - 1, -1, true, false);
                            }
                            iY0 = iArr[i3 - 1];
                        } else {
                            iY0 = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).Y0() : 0;
                        }
                        hdc adapter = z15Var2.getAdapter();
                        if (adapter != null) {
                            if (adapter.j() - iY0 <= r15Var.b && ((z15Var2.getIgnoreRefreshingFlagsForScrollEvent() || !z15Var2.d2) && t15Var.m())) {
                                if (z15Var2.g2 != null) {
                                    z15Var2.getRefreshingNextDelegate();
                                    z15Var2.setRefreshingNext(true);
                                }
                                t15Var.l();
                            }
                            a layoutManager2 = z15Var2.getLayoutManager();
                            if (layoutManager2 instanceof StaggeredGridLayoutManager) {
                                StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) layoutManager2;
                                int i5 = staggeredGridLayoutManager2.p;
                                int[] iArr2 = new int[i5];
                                for (int i6 = 0; i6 < staggeredGridLayoutManager2.p; i6++) {
                                    qxd qxdVar2 = staggeredGridLayoutManager2.q[i6];
                                    boolean z2 = ((StaggeredGridLayoutManager) qxdVar2.f).w;
                                    ArrayList arrayList2 = (ArrayList) qxdVar2.e;
                                    iArr2[i6] = z2 ? qxdVar2.g(arrayList2.size() - 1, -1, true, false) : qxdVar2.g(0, arrayList2.size(), true, false);
                                }
                                iW0 = iArr2[i5 - 1];
                            } else if (layoutManager2 instanceof LinearLayoutManager) {
                                iW0 = ((LinearLayoutManager) layoutManager2).W0();
                            }
                            if (iW0 < 0 || iW0 > r15Var.b) {
                                return;
                            }
                            if ((z15Var2.getIgnoreRefreshingFlagsForScrollEvent() || !z15Var2.e2) && t15Var.h()) {
                                if (z15Var2.g2 != null) {
                                    z15Var2.setRefreshingPrev(true);
                                }
                                t15Var.j();
                            }
                        }
                    }
                });
                break;
            default:
                FastScroller fastScroller = (FastScroller) this.c;
                if (fastScroller.o != null && !fastScroller.z0 && fastScroller.b.getChildCount() > 0) {
                    c(recyclerView);
                    break;
                }
                break;
        }
    }

    public void c(RecyclerView recyclerView) {
        int iComputeHorizontalScrollOffset;
        int iComputeHorizontalScrollExtent;
        int iComputeHorizontalScrollRange;
        FastScroller fastScroller = (FastScroller) this.c;
        if (fastScroller.c()) {
            iComputeHorizontalScrollOffset = recyclerView.computeVerticalScrollOffset();
            iComputeHorizontalScrollExtent = recyclerView.computeVerticalScrollExtent();
            iComputeHorizontalScrollRange = recyclerView.computeVerticalScrollRange();
        } else {
            iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            iComputeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
            iComputeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
        }
        fastScroller.setScrollerPosition(iComputeHorizontalScrollOffset / (iComputeHorizontalScrollRange - iComputeHorizontalScrollExtent));
        Iterator it = ((ArrayList) this.d).iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    public r15(FastScroller fastScroller) {
        this.a = 1;
        this.d = new ArrayList();
        this.b = 0;
        this.c = fastScroller;
    }
}
