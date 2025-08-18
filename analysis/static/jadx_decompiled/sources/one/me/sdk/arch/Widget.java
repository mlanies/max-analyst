package one.me.sdk.arch;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a5g;
import defpackage.a66;
import defpackage.av3;
import defpackage.b5g;
import defpackage.br7;
import defpackage.bvc;
import defpackage.c5g;
import defpackage.dp3;
import defpackage.e5f;
import defpackage.eh7;
import defpackage.f46;
import defpackage.fg7;
import defpackage.fs;
import defpackage.g5g;
import defpackage.gh7;
import defpackage.gv3;
import defpackage.h5g;
import defpackage.hm9;
import defpackage.i5g;
import defpackage.ia3;
import defpackage.im;
import defpackage.ir6;
import defpackage.j03;
import defpackage.je7;
import defpackage.k56;
import defpackage.l23;
import defpackage.m56;
import defpackage.mn5;
import defpackage.njc;
import defpackage.od2;
import defpackage.onf;
import defpackage.pg7;
import defpackage.pm0;
import defpackage.pnf;
import defpackage.q7c;
import defpackage.qi9;
import defpackage.qm0;
import defpackage.rpc;
import defpackage.rzd;
import defpackage.swb;
import defpackage.tnf;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.ukc;
import defpackage.us7;
import defpackage.uu3;
import defpackage.v3c;
import defpackage.vs7;
import defpackage.w12;
import defpackage.w5g;
import defpackage.wg0;
import defpackage.x27;
import defpackage.z4g;
import defpackage.z84;
import defpackage.zn5;
import defpackage.znc;
import defpackage.zr6;
import defpackage.zu3;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import one.me.sdk.arch.internal.BinderNotFoundValueException;

@Metadata(d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u0090\u0001\b&\u0018\u0000 ª\u00012\u00020\u0001:\u0002«\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0015¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0015¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0015¢\u0006\u0004\b,\u0010+J5\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001\"\n\b\u0000\u0010.\u0018\u0001*\u00020-2\u000e\b\b\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0087\bø\u0001\u0000¢\u0006\u0004\b2\u00103J?\u00109\u001a\b\u0012\u0004\u0012\u00028\u000001\"\n\b\u0000\u0010.\u0018\u0001*\u00020-2\u0006\u00105\u001a\u0002042\u0010\b\n\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010/H\u0087\bø\u0001\u0000¢\u0006\u0004\b7\u00108J;\u0010>\u001a\b\u0012\u0004\u0012\u00028\u000001\"\b\b\u0000\u0010.*\u00020-2\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0/H\u0001¢\u0006\u0004\b>\u0010?JG\u0010B\u001a\b\u0012\u0004\u0012\u00028\u000001\"\b\b\u0000\u0010.*\u00020-2\u0006\u00105\u001a\u0002042\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010/H\u0001¢\u0006\u0004\b@\u0010AJ%\u0010E\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010C*\u00020\u000b2\b\b\u0001\u0010D\u001a\u00020\u0004H\u0004¢\u0006\u0004\bE\u0010FJ/\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000H\"\b\b\u0000\u0010G*\u00020\u000b2\b\b\u0001\u0010D\u001a\u00020\u0004H\u0004¢\u0006\u0004\bI\u0010JJ-\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000M\"\b\b\u0000\u0010G*\u00020K2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0004¢\u0006\u0004\bN\u0010OJ=\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020R0H2\b\b\u0001\u0010P\u001a\u00020\u00042\u0016\b\u0002\u0010S\u001a\u0010\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u0012\u0018\u00010QH\u0004¢\u0006\u0004\bT\u0010UJ%\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020V0H2\b\b\u0001\u0010P\u001a\u00020\u0004H\u0004¢\u0006\u0004\bW\u0010JJS\u0010^\u001a\u00020\u0012\"\u0004\b\u0000\u0010G*\b\u0012\u0004\u0012\u00028\u00000X2\b\b\u0002\u0010Z\u001a\u00020Y2$\b\u0004\u0010]\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\\\u0012\u0006\u0012\u0004\u0018\u00010K0[H\u0084\bø\u0001\u0000¢\u0006\u0004\b^\u0010_J.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000c\"\u0006\b\u0000\u0010G\u0018\u00012\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00028\u0000H\u0084\b¢\u0006\u0004\b\u0003\u0010dJ&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000c\"\u0006\b\u0000\u0010G\u0018\u00012\u0006\u0010a\u001a\u00020`H\u0084\b¢\u0006\u0004\b\u0003\u0010eJ)\u0010g\u001a\u00020\u00122\u0014\b\u0004\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120QH\u0084\bø\u0001\u0000¢\u0006\u0004\bg\u0010hJ\u000f\u0010j\u001a\u0004\u0018\u00010i¢\u0006\u0004\bj\u0010kJ\u0019\u0010n\u001a\u0004\u0018\u00010\u00002\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010p\u001a\u00020\u00122\u0006\u0010o\u001a\u00020\u0001H\u0002¢\u0006\u0004\bp\u0010qR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010rR\u001a\u0010t\u001a\u00020s8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR&\u0010z\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020y0x8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u001b\u00105\u001a\u0002048\u0016X\u0096\u0004¢\u0006\r\n\u0004\b5\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R \u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R \u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0016X\u0096D¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008c\u0001\u0010\u008e\u0001R\u0016\u0010\u008f\u0001\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010~R\u0018\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\"\u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u0012\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001f\u0010\u009b\u0001\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010kR\u0015\u0010\u009f\u0001\u001a\u00030\u009c\u00018F¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0015\u0010£\u0001\u001a\u00030 \u00018F¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0015\u0010§\u0001\u001a\u00030¤\u00018F¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0015\u0010©\u0001\u001a\u00030 \u00018F¢\u0006\b\u001a\u0006\b¨\u0001\u0010¢\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006¬\u0001"}, d2 = {"Lone/me/sdk/arch/Widget;", "Luu3;", "Landroid/os/Bundle;", "args", "", "layoutRes", "<init>", "(Landroid/os/Bundle;I)V", "Lim;", "requireActivity", "()Lim;", "Landroid/view/View;", "requireView", "()Landroid/view/View;", "Landroid/content/res/Resources;", "requireResources", "()Landroid/content/res/Resources;", "newArgs", "Le5f;", "updateArgs", "(Landroid/os/Bundle;)V", "oldArgs", "onUpdateArgs", "(Landroid/os/Bundle;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedViewState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;)V", "Lzu3;", "changeHandler", "Lav3;", "changeType", "onChangeStarted", "(Lzu3;Lav3;)V", "Landroid/app/Activity;", "activity", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "Lpnf;", "VM", "Lkotlin/Function0;", "vmProducer", "Lje7;", "viewModel", "(Lk56;)Lje7;", "Lsuc;", "scopeId", "defaultFactory", "sharedViewModel-qk3jasM", "(Ljava/lang/String;Lk56;)Lje7;", "sharedViewModel", "Ljava/lang/Class;", "viewModelClass", "Lonf;", "factoryProducer", "createViewModelLazy", "(Ljava/lang/Class;Lk56;)Lje7;", "getSharedViewModel-cp94BC8", "(Ljava/lang/String;Ljava/lang/Class;Lk56;)Lje7;", "getSharedViewModel", "V", "id", "findViewById", "(I)Landroid/view/View;", "T", "Lq7c;", "viewBinding", "(I)Lq7c;", "", "bindAction", "Lqm0;", "binding", "(Lk56;)Lqm0;", "containerId", "Lkotlin/Function1;", "Lznc;", "routerBuilder", "childRouter", "(ILm56;)Lq7c;", "Lj03;", "childSlotRouter", "Lmn5;", "Lfg7;", "minActiveState", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "collectInViewScope", "(Lmn5;Lfg7;La66;)V", "", "key", "defaultValue", "Lfs;", "(Ljava/lang/String;Ljava/lang/Object;)Lfs;", "(Ljava/lang/String;)Lfs;", "action", "doActionIfRootExist", "(Lm56;)V", "Lw12;", "addIfNeedChildWidgetContainer", "()Lw12;", "findWidgetByScopeId-iP7A0G4", "(Ljava/lang/String;)Lone/me/sdk/arch/Widget;", "findWidgetByScopeId", "controller", "finalizeCleanActions", "(Luu3;)V", "I", "Lw5g;", "viewModelStore", "Lw5g;", "getViewModelStore$arch_release", "()Lw5g;", "Lqi9;", "Ll23;", "cleanActions", "Lqi9;", "getCleanActions$arch_release", "()Lqi9;", "Ljava/lang/String;", "getScopeId-IluPPks", "()Ljava/lang/String;", "Lx27;", "insetsConfig", "Lx27;", "getInsetsConfig", "()Lx27;", "Lbvc;", "screenDelegate", "Lbvc;", "getScreenDelegate", "()Lbvc;", "", "isDialog", "Z", "()Z", "tag", "i5g", "internalLifecycleListener", "Li5g;", "Lgv3;", "_viewLifecycleOwner", "Lgv3;", "get_viewLifecycleOwner$annotations", "()V", "childWidgetContainer$delegate", "Lje7;", "getChildWidgetContainer", "childWidgetContainer", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lpg7;", "getLifecycleScope", "()Lpg7;", "lifecycleScope", "Leh7;", "getViewLifecycleOwner", "()Leh7;", "viewLifecycleOwner", "getViewLifecycleScope", "viewLifecycleScope", "Companion", "c5g", "arch_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public abstract class Widget extends uu3 {
    public static final String ARG_SCOPE_ID = "arg_key_scope_id";
    public static final c5g Companion = new c5g();
    private static final AtomicInteger allocationsCount = new AtomicInteger(0);
    private gv3 _viewLifecycleOwner;

    /* renamed from: childWidgetContainer$delegate, reason: from kotlin metadata */
    private final je7 childWidgetContainer;
    private final qi9 cleanActions;
    private final x27 insetsConfig;
    private final i5g internalLifecycleListener;
    private final boolean isDialog;
    private final int layoutRes;
    private final String scopeId;
    private final bvc screenDelegate;
    private final String tag;
    private final w5g viewModelStore;

    /* JADX WARN: Multi-variable type inference failed */
    public Widget() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object binding$lambda$8(k56 k56Var, Object obj) {
        return k56Var.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e5f binding$lambda$9(Widget widget, Object obj, l23 l23Var) {
        qi9 qi9Var = widget.cleanActions;
        int iE = qi9Var.e(obj);
        if (iE < 0) {
            iE = ~iE;
        }
        Object[] objArr = qi9Var.c;
        Object obj2 = objArr[iE];
        qi9Var.b[iE] = obj;
        objArr[iE] = l23Var;
        return e5f.a;
    }

    public static /* synthetic */ q7c childRouter$default(Widget widget, int i, m56 m56Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: childRouter");
        }
        if ((i2 & 2) != 0) {
            m56Var = null;
        }
        return widget.childRouter(i, m56Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final znc childRouter$lambda$10(Widget widget, int i, m56 m56Var, znc zncVar) {
        ViewGroup viewGroup = (ViewGroup) widget.requireView().findViewById(i);
        if (m56Var == null) {
            return widget.getChildRouter(viewGroup);
        }
        znc childRouter = widget.getChildRouter(viewGroup);
        m56Var.invoke(childRouter);
        return childRouter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j03 childSlotRouter$lambda$11(Widget widget, int i, j03 j03Var) {
        return new j03(widget.getChildRouter((ViewGroup) widget.requireView().findViewById(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w12 childWidgetContainer_delegate$lambda$13(Widget widget) {
        w12 w12Var = new w12(widget.getContext());
        w12Var.setId(swb.arch_child_widget_wrapper_id);
        return w12Var;
    }

    public static void collectInViewScope$default(Widget widget, mn5 mn5Var, fg7 fg7Var, a66 a66Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectInViewScope");
        }
        if ((i & 1) != 0) {
            fg7Var = fg7.o;
        }
        od2.L(new zn5(tu0.g(mn5Var, widget.getViewLifecycleOwner().Q(), fg7Var), new g5g(a66Var, null), 5), widget.getViewLifecycleScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finalizeCleanActions(uu3 controller) {
        long[] jArr;
        long[] jArr2;
        int i;
        if (this.cleanActions.h()) {
            return;
        }
        String strW = v3c.w(controller);
        ir6 ir6Var = hm9.m;
        Object obj = null;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, strW, zr6.h(getCleanActions().e, "view detached, call onFinalize for clean actions "), null);
        }
        qi9 qi9Var = this.cleanActions;
        Object[] objArr = qi9Var.c;
        long[] jArr3 = qi9Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            pm0 pm0Var = (pm0) ((l23) objArr[(i2 << 3) + i5]);
                            if (!pm0Var.a) {
                                qm0 qm0Var = pm0Var.b;
                                qm0Var.X = new WeakReference(qm0Var.o);
                                qm0Var.o = obj;
                                pm0Var.a = true;
                            }
                            String strI = wg0.i("Binder_", v3c.w(pm0Var.c));
                            qm0 qm0Var2 = pm0Var.b;
                            ir6 ir6Var2 = hm9.m;
                            if (ir6Var2 != null && ir6Var2.c()) {
                                us7 us7Var = us7.X;
                                WeakReference weakReference = qm0Var2.X;
                                jArr2 = jArr3;
                                ir6Var2.d(us7Var, strI, "onFinalize " + weakReference + "/" + (weakReference != null ? weakReference.get() : obj), null);
                            } else {
                                jArr2 = jArr3;
                            }
                            WeakReference weakReference2 = pm0Var.b.X;
                            if (weakReference2 != null) {
                                weakReference2.clear();
                            }
                            obj = null;
                            pm0Var.b.X = null;
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
            }
        }
        this.cleanActions.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x001f, code lost:
    
        r0 = null;
     */
    /* renamed from: findWidgetByScopeId-iP7A0G4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final one.me.sdk.arch.Widget m38findWidgetByScopeIdiP7A0G4(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            boolean r0 = defpackage.tpa.f(r4, r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.String r0 = "default"
            boolean r0 = defpackage.tpa.f(r4, r0)
            if (r0 == 0) goto L13
            return r3
        L13:
            uu3 r0 = r3.getParentController()
            boolean r2 = r0 instanceof one.me.sdk.arch.Widget
            if (r2 == 0) goto L1e
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
            goto L1f
        L1e:
            r0 = r1
        L1f:
            if (r0 == 0) goto L36
            java.lang.String r2 = r0.getC()
            boolean r2 = defpackage.tpa.f(r2, r4)
            if (r2 != 0) goto L36
            uu3 r0 = r0.getParentController()
            boolean r2 = r0 instanceof one.me.sdk.arch.Widget
            if (r2 == 0) goto L1e
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
            goto L1f
        L36:
            uu3 r3 = r3.getTargetController()
            boolean r2 = r3 instanceof one.me.sdk.arch.Widget
            if (r2 == 0) goto L41
            one.me.sdk.arch.Widget r3 = (one.me.sdk.arch.Widget) r3
            goto L42
        L41:
            r3 = r1
        L42:
            if (r0 != 0) goto L55
            if (r3 == 0) goto L4a
            java.lang.String r1 = r3.getC()
        L4a:
            if (r1 != 0) goto L4e
            r4 = 0
            goto L52
        L4e:
            boolean r4 = defpackage.tpa.f(r1, r4)
        L52:
            if (r4 == 0) goto L55
            r0 = r3
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.arch.Widget.m38findWidgetByScopeIdiP7A0G4(java.lang.String):one.me.sdk.arch.Widget");
    }

    private final w12 getChildWidgetContainer() {
        return (w12) this.childWidgetContainer.getValue();
    }

    /* renamed from: getSharedViewModel-cp94BC8$default, reason: not valid java name */
    public static /* synthetic */ je7 m39getSharedViewModelcp94BC8$default(Widget widget, String str, Class cls, k56 k56Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSharedViewModel-cp94BC8");
        }
        if ((i & 4) != 0) {
            k56Var = null;
        }
        return widget.m41getSharedViewModelcp94BC8(str, cls, k56Var);
    }

    private static /* synthetic */ void get_viewLifecycleOwner$annotations() {
    }

    /* renamed from: sharedViewModel-qk3jasM$default, reason: not valid java name */
    public static /* synthetic */ je7 m40sharedViewModelqk3jasM$default(Widget widget, String str, k56 k56Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedViewModel-qk3jasM");
        }
        tpa.F();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View viewBinding$lambda$5(Widget widget, int i, View view) {
        Object njcVar;
        if (view != null) {
        }
        try {
            return widget.requireView().findViewById(i);
        } catch (Throwable th) {
            try {
                njcVar = widget.getContext().getResources().getResourceName(i);
            } catch (Throwable th2) {
                njcVar = new njc(th2);
            }
            Object objH = zr6.h(i, "#");
            if (njcVar instanceof njc) {
                njcVar = objH;
            }
            throw new BinderNotFoundValueException(wg0.i("could not find view ", (String) njcVar), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e5f viewBinding$lambda$6(Widget widget, View view, l23 l23Var) {
        qi9 qi9Var = widget.cleanActions;
        int iE = qi9Var.e(view);
        if (iE < 0) {
            iE = ~iE;
        }
        Object[] objArr = qi9Var.c;
        Object obj = objArr[iE];
        qi9Var.b[iE] = view;
        objArr[iE] = l23Var;
        return e5f.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean viewBinding$lambda$7(Widget widget, View view) {
        return view.getParent() == widget.getView();
    }

    public final w12 addIfNeedChildWidgetContainer() {
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return null;
        }
        if (getChildWidgetContainer().getParent() == null) {
            br7.b(viewGroup, getChildWidgetContainer(), Integer.valueOf(viewGroup.getChildCount()));
        }
        return getChildWidgetContainer();
    }

    public final /* synthetic */ <T> fs args(String key, T defaultValue) {
        tpa.F();
        throw null;
    }

    public final <T> qm0 binding(k56 bindAction) {
        return new qm0(this, new rpc(18, bindAction), new a5g(this, 1), 8);
    }

    public final q7c childRouter(int containerId, m56 routerBuilder) {
        return new qm0(this, new ukc(this, containerId, routerBuilder), (a5g) null, 12);
    }

    public final q7c childSlotRouter(int containerId) {
        return new qm0(this, new z4g(this, containerId, 0), (a5g) null, 12);
    }

    public final <T> void collectInViewScope(mn5 mn5Var, fg7 fg7Var, a66 a66Var) {
        od2.L(new zn5(tu0.g(mn5Var, getViewLifecycleOwner().Q(), fg7Var), new g5g(a66Var, null), 5), getViewLifecycleScope());
    }

    public final <VM extends pnf> je7 createViewModelLazy(Class<VM> viewModelClass, k56 factoryProducer) {
        w5g w5gVar = this.viewModelStore;
        onf onfVar = (onf) factoryProducer.invoke();
        w5gVar.getClass();
        w5gVar.b.k(wg0.i("one.me.sdk.arch.ViewModelStore:key:", viewModelClass.getCanonicalName()), onfVar);
        return new h5g(this, viewModelClass);
    }

    public final void doActionIfRootExist(m56 action) {
        View view = getView();
        if (view != null) {
            action.invoke(view);
        }
    }

    public final <V extends View> V findViewById(int id) {
        View view = getView();
        if (view != null) {
            return (V) view.findViewById(id);
        }
        return null;
    }

    /* renamed from: getCleanActions$arch_release, reason: from getter */
    public final qi9 getCleanActions() {
        return this.cleanActions;
    }

    public final Context getContext() {
        return requireActivity();
    }

    /* renamed from: getInsetsConfig, reason: from getter */
    public x27 getA() {
        return this.insetsConfig;
    }

    public final pg7 getLifecycleScope() {
        return f46.J(this.lifecycleOwner);
    }

    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public String getC() {
        return this.scopeId;
    }

    /* renamed from: getScreenDelegate, reason: from getter */
    public bvc getF0() {
        return this.screenDelegate;
    }

    /* renamed from: getSharedViewModel-cp94BC8, reason: not valid java name */
    public final <VM extends pnf> je7 m41getSharedViewModelcp94BC8(String scopeId, Class<VM> viewModelClass, k56 defaultFactory) {
        return new tnf(this, scopeId, viewModelClass, defaultFactory);
    }

    public final eh7 getViewLifecycleOwner() {
        return this._viewLifecycleOwner;
    }

    public final pg7 getViewLifecycleScope() {
        return f46.J(this._viewLifecycleOwner);
    }

    /* renamed from: getViewModelStore$arch_release, reason: from getter */
    public final w5g getViewModelStore() {
        return this.viewModelStore;
    }

    /* renamed from: isDialog, reason: from getter */
    public boolean getA() {
        return this.isDialog;
    }

    @Override // defpackage.uu3
    public void onActivityPaused(Activity activity) {
    }

    @Override // defpackage.uu3
    public void onActivityResumed(Activity activity) {
    }

    @Override // defpackage.uu3
    public void onChangeStarted(zu3 changeHandler, av3 changeType) {
        if (changeType == av3.POP_ENTER || changeType == av3.PUSH_ENTER) {
            getF0().a();
        }
    }

    @Override // defpackage.uu3
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedViewState) {
        return inflater.inflate(this.layoutRes, container, false);
    }

    public void onUpdateArgs(Bundle oldArgs, Bundle newArgs) {
    }

    public void onViewCreated(View view) {
    }

    public final im requireActivity() {
        return (im) getActivity();
    }

    public final Resources requireResources() {
        Resources resources = getResources();
        if (resources != null) {
            return resources;
        }
        throw new IllegalArgumentException(("Resources are null because of widget " + this + " is not attached to an activity").toString());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalArgumentException("view is null!".toString());
    }

    /* renamed from: sharedViewModel-qk3jasM, reason: not valid java name */
    public final /* synthetic */ <VM extends pnf> je7 m42sharedViewModelqk3jasM(String scopeId, k56 defaultFactory) {
        tpa.F();
        throw null;
    }

    public final void updateArgs(Bundle newArgs) {
        Bundle bundleDeepCopy = getArgs().deepCopy();
        getArgs().clear();
        getArgs().putAll(newArgs);
        onUpdateArgs(bundleDeepCopy, getArgs());
    }

    public final <T extends View> q7c viewBinding(int id) {
        return new qm0(this, new z4g(this, id, 1), new a5g(this, 0), new b5g(this, 0));
    }

    public final /* synthetic */ <VM extends pnf> je7 viewModel(k56 vmProducer) {
        tpa.F();
        throw null;
    }

    public /* synthetic */ Widget(Bundle bundle, int i, int i2, z84 z84Var) {
        this((i2 & 1) != 0 ? null : bundle, (i2 & 2) != 0 ? -1 : i);
    }

    public final /* synthetic */ <T> fs args(String key) {
        tpa.F();
        throw null;
    }

    public Widget(Bundle bundle, int i) {
        super(bundle);
        this.layoutRes = i;
        this.viewModelStore = new w5g();
        this.cleanActions = new qi9(3);
        this.scopeId = "default";
        this.insetsConfig = x27.c;
        this.screenDelegate = dp3.X;
        this.tag = getClass().getName();
        i5g i5gVar = new i5g(this);
        this.internalLifecycleListener = i5gVar;
        gv3 gv3Var = new gv3();
        gv3Var.a = new gh7(gv3Var);
        addLifecycleListener(new ia3(2, gv3Var));
        this._viewLifecycleOwner = gv3Var;
        hm9.n(getClass().getName(), "allocations count = " + allocationsCount.incrementAndGet());
        addLifecycleListener(i5gVar);
        addLifecycleListener(vs7.a);
        this.childWidgetContainer = tu0.r(3, new rzd(17, this));
    }
}
