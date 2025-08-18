package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public abstract class uu3 {
    private static final String KEY_ARGS = "Controller.args";
    private static final String KEY_CHILD_ROUTERS = "Controller.childRouters";
    private static final String KEY_CLASS_NAME = "Controller.className";
    private static final String KEY_INSTANCE_ID = "Controller.instanceId";
    private static final String KEY_NEEDS_ATTACH = "Controller.needsAttach";
    private static final String KEY_OVERRIDDEN_POP_HANDLER = "Controller.overriddenPopHandler";
    private static final String KEY_OVERRIDDEN_PUSH_HANDLER = "Controller.overriddenPushHandler";
    private static final String KEY_REQUESTED_PERMISSIONS = "Controller.requestedPermissions";
    private static final String KEY_RETAIN_VIEW_MODE = "Controller.retainViewMode";
    private static final String KEY_SAVED_STATE = "Controller.savedState";
    private static final String KEY_TARGET_INSTANCE_ID = "Controller.target.instanceId";
    private static final String KEY_VIEW_STATE = "Controller.viewState";
    static final String KEY_VIEW_STATE_BUNDLE = "Controller.viewState.bundle";
    private static final String KEY_VIEW_STATE_HIERARCHY = "Controller.viewState.hierarchy";
    private final Bundle args;
    private boolean attached;
    private boolean attachedToUnownedParent;
    private boolean awaitingParentAttach;
    private boolean destroyed;
    private WeakReference<View> destroyedView;
    private boolean hasOptionsMenu;
    private boolean hasSavedViewState;
    String instanceId;
    boolean isBeingDestroyed;
    private boolean isContextAvailable;
    boolean isDetachFrozen;
    private boolean isPerformingExitTransition;
    public final eh7 lifecycleOwner;
    private boolean needsAttach;
    final a3a onBackPressedCallback;
    boolean onBackPressedDispatcherEnabled;
    private boolean optionsMenuHidden;
    private zu3 overriddenPopHandler;
    private zu3 overriddenPushHandler;
    private uu3 parentController;
    znc router;
    private Bundle savedInstanceState;
    private String targetInstanceId;
    View view;
    private gmf viewAttachHandler;
    boolean viewIsAttached;
    Bundle viewState;
    boolean viewWasDetached;
    private tu3 retainViewMode = tu3.a;
    private final List<dv3> childRouters = new ArrayList();
    private final List<su3> lifecycleListeners = new ArrayList();
    private final ArrayList<String> requestedPermissions = new ArrayList<>();
    private final ArrayList<aoc> onRouterSetListeners = new ArrayList<>();

    public uu3(Bundle bundle) throws SecurityException {
        Constructor<?> constructor;
        Widget widget = (Widget) this;
        this.onBackPressedCallback = new ru3(widget, 0);
        this.lifecycleOwner = new bx1(widget);
        this.args = bundle == null ? new Bundle(getClass().getClassLoader()) : bundle;
        this.instanceId = UUID.randomUUID().toString();
        Constructor<?>[] constructors = getClass().getConstructors();
        if (a0(constructors) == null) {
            int length = constructors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                } else {
                    i++;
                }
            }
            if (constructor == null) {
                throw new RuntimeException(getClass() + " does not have a constructor that takes a Bundle argument or a default constructor. Controllers must have one of these in order to restore their states.");
            }
        }
        loa loaVar = new loa();
        loaVar.o = Bundle.EMPTY;
        addLifecycleListener(new joa(loaVar, widget));
    }

    public static Constructor a0(Constructor[] constructorArr) {
        for (Constructor constructor : constructorArr) {
            if (constructor.getParameterTypes().length == 1 && constructor.getParameterTypes()[0] == Bundle.class) {
                return constructor;
            }
        }
        return null;
    }

    public static uu3 newInstance(Bundle bundle) throws SecurityException {
        Constructor<?> constructor;
        uu3 uu3Var;
        String string = bundle.getString(KEY_CLASS_NAME);
        Class clsJ = ema.j(string, false);
        Constructor<?>[] constructors = clsJ.getConstructors();
        Constructor constructorA0 = a0(constructors);
        Bundle bundle2 = bundle.getBundle(KEY_ARGS);
        if (bundle2 != null) {
            bundle2.setClassLoader(clsJ.getClassLoader());
        }
        try {
            if (constructorA0 != null) {
                uu3Var = (uu3) constructorA0.newInstance(bundle2);
            } else {
                int length = constructors.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    }
                    i++;
                }
                uu3Var = (uu3) constructor.newInstance(null);
                if (bundle2 != null) {
                    uu3Var.args.putAll(bundle2);
                }
            }
            uu3Var.getClass();
            Bundle bundle3 = bundle.getBundle(KEY_VIEW_STATE);
            uu3Var.viewState = bundle3;
            if (bundle3 != null) {
                bundle3.setClassLoader(uu3Var.getClass().getClassLoader());
            }
            uu3Var.instanceId = bundle.getString(KEY_INSTANCE_ID);
            uu3Var.targetInstanceId = bundle.getString(KEY_TARGET_INSTANCE_ID);
            uu3Var.requestedPermissions.addAll(bundle.getStringArrayList(KEY_REQUESTED_PERMISSIONS));
            Bundle bundle4 = bundle.getBundle(KEY_OVERRIDDEN_PUSH_HANDLER);
            HashMap map = zu3.c;
            uu3Var.overriddenPushHandler = np8.p(bundle4);
            uu3Var.overriddenPopHandler = np8.p(bundle.getBundle(KEY_OVERRIDDEN_POP_HANDLER));
            uu3Var.needsAttach = bundle.getBoolean(KEY_NEEDS_ATTACH);
            uu3Var.retainViewMode = tu3.values()[bundle.getInt(KEY_RETAIN_VIEW_MODE, 0)];
            for (Bundle bundle5 : bundle.getParcelableArrayList(KEY_CHILD_ROUTERS)) {
                dv3 dv3Var = new dv3();
                if (dv3Var.j == null) {
                    dv3Var.j = uu3Var;
                    dv3Var.Q(uu3Var.onBackPressedDispatcherEnabled);
                }
                dv3Var.N(bundle5);
                uu3Var.childRouters.add(dv3Var);
            }
            Bundle bundle6 = bundle.getBundle(KEY_SAVED_STATE);
            uu3Var.savedInstanceState = bundle6;
            if (bundle6 != null) {
                bundle6.setClassLoader(uu3Var.getClass().getClassLoader());
            }
            uu3Var.b0();
            return uu3Var;
        } catch (Exception e) {
            StringBuilder sbM = au1.m("An exception occurred while creating a new instance of ", string, ". ");
            sbM.append(e.getMessage());
            throw new RuntimeException(sbM.toString(), e);
        }
    }

    private void removeViewReference(Context context) {
        View view = this.view;
        if (view != null) {
            if (context == null) {
                context = view.getContext();
            }
            if (!this.isBeingDestroyed && !this.hasSavedViewState) {
                d0(this.view);
            }
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((su3) it.next()).s(this, this.view);
            }
            onDestroyView(this.view);
            gmf gmfVar = this.viewAttachHandler;
            if (gmfVar != null) {
                View view2 = this.view;
                view2.removeOnAttachStateChangeListener(gmfVar);
                if (gmfVar.Y != null && (view2 instanceof ViewGroup)) {
                    gmf.a((ViewGroup) view2).removeOnAttachStateChangeListener(gmfVar.Y);
                    gmfVar.Y = null;
                }
            }
            this.viewAttachHandler = null;
            this.viewIsAttached = false;
            if (this.isBeingDestroyed) {
                this.destroyedView = new WeakReference<>(this.view);
            }
            this.view = null;
            Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
            while (it2.hasNext()) {
                ((su3) it2.next()).l(this);
            }
            Iterator<dv3> it3 = this.childRouters.iterator();
            while (it3.hasNext()) {
                it3.next().Z();
            }
        }
        if (this.isBeingDestroyed) {
            if (context == null) {
                context = getActivity();
            }
            if (this.isContextAvailable) {
                onContextUnavailable(context);
            }
            if (this.destroyed) {
                return;
            }
            Iterator it4 = new ArrayList(this.lifecycleListeners).iterator();
            while (it4.hasNext()) {
                ((su3) it4.next()).r(this);
            }
            this.destroyed = true;
            onDestroy();
            this.parentController = null;
            Iterator it5 = new ArrayList(this.lifecycleListeners).iterator();
            while (it5.hasNext()) {
                ((su3) it5.next()).k(this);
            }
        }
    }

    public final void Z(boolean z) {
        this.isBeingDestroyed = true;
        znc zncVar = this.router;
        if (zncVar != null) {
            zncVar.Y(this.instanceId);
        }
        Iterator<dv3> it = this.childRouters.iterator();
        while (it.hasNext()) {
            it.next().c(false);
        }
        if (!this.attached) {
            removeViewReference(null);
        } else if (z) {
            detach(this.view, true, false);
        }
    }

    public final void activityDestroyed(Activity activity) {
        if (activity.isChangingConfigurations()) {
            detach(this.view, true, false);
        } else {
            Z(true);
        }
        onContextUnavailable(activity);
    }

    public final void activityPaused(Activity activity) {
        onActivityPaused(activity);
    }

    public final void activityResumed(Activity activity) {
        View view;
        boolean z = this.attached;
        if (!z && (view = this.view) != null && this.viewIsAttached) {
            attach(view);
        } else if (z) {
            this.needsAttach = false;
            this.hasSavedViewState = false;
        }
        onActivityResumed(activity);
    }

    public final void activityStarted(Activity activity) {
        gmf gmfVar = this.viewAttachHandler;
        if (gmfVar != null) {
            gmfVar.c = false;
            gmfVar.b();
        }
        onActivityStarted(activity);
    }

    public final void activityStopped(Activity activity) {
        boolean z = this.attached;
        gmf gmfVar = this.viewAttachHandler;
        if (gmfVar != null) {
            gmfVar.c = true;
            gmfVar.c(true);
        }
        if (z && activity.isChangingConfigurations()) {
            this.needsAttach = true;
        }
        onActivityStopped(activity);
    }

    public final void addLifecycleListener(su3 su3Var) {
        if (this.lifecycleListeners.contains(su3Var)) {
            return;
        }
        this.lifecycleListeners.add(su3Var);
    }

    public void attach(View view) {
        boolean z = this.router == null || view.getParent() != this.router.i;
        this.attachedToUnownedParent = z;
        if (z || this.isBeingDestroyed) {
            return;
        }
        uu3 uu3Var = this.parentController;
        if (uu3Var != null && !uu3Var.attached) {
            this.awaitingParentAttach = true;
            return;
        }
        this.awaitingParentAttach = false;
        this.hasSavedViewState = false;
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((su3) it.next()).n(this, view);
        }
        this.attached = true;
        this.needsAttach = this.router.h;
        onAttach(view);
        if (this.hasOptionsMenu && !this.optionsMenuHidden) {
            this.router.o();
        }
        Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
        while (it2.hasNext()) {
            ((su3) it2.next()).g(this);
        }
        for (dv3 dv3Var : this.childRouters) {
            Iterator it3 = dv3Var.a.iterator();
            while (true) {
                u1 u1Var = (u1) it3;
                if (!u1Var.hasNext()) {
                    break;
                }
                uu3 uu3Var2 = ((coc) u1Var.next()).a;
                if (uu3Var2.awaitingParentAttach) {
                    uu3Var2.attach(uu3Var2.view);
                }
            }
            if ((dv3Var.j == null || dv3Var.i == null) ? false : true) {
                dv3Var.I();
            }
        }
    }

    public final void b0() {
        Bundle bundle = this.savedInstanceState;
        if (bundle == null || this.router == null) {
            return;
        }
        onRestoreInstanceState(bundle);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((su3) it.next()).c(this, this.savedInstanceState);
        }
        this.savedInstanceState = null;
    }

    public final void c0() {
        for (dv3 dv3Var : this.childRouters) {
            if (dv3Var.j == null || dv3Var.i == null) {
                View viewFindViewById = this.view.findViewById(dv3Var.k);
                if (viewFindViewById instanceof ViewGroup) {
                    dv3Var.b0(this, (ViewGroup) viewFindViewById);
                    dv3Var.I();
                }
            }
        }
    }

    public final void changeEnded(zu3 zu3Var, av3 av3Var) {
        WeakReference<View> weakReference;
        if (!av3Var.b) {
            this.isPerformingExitTransition = false;
            Iterator<dv3> it = this.childRouters.iterator();
            while (it.hasNext()) {
                it.next().a0(false);
            }
        }
        onChangeEnded(zu3Var, av3Var);
        Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
        while (it2.hasNext()) {
            ((su3) it2.next()).a(this, zu3Var, av3Var);
        }
        if (this.isBeingDestroyed && !this.viewIsAttached && !this.attached && (weakReference = this.destroyedView) != null) {
            View view = weakReference.get();
            if (this.router.i != null && view != null) {
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = this.router.i;
                if (parent == viewGroup) {
                    viewGroup.removeView(view);
                }
            }
            this.destroyedView = null;
        }
        zu3Var.getClass();
    }

    public final void changeStarted(zu3 zu3Var, av3 av3Var) {
        if (!av3Var.b) {
            this.isPerformingExitTransition = true;
            Iterator<dv3> it = this.childRouters.iterator();
            while (it.hasNext()) {
                it.next().a0(true);
            }
        }
        onChangeStarted(zu3Var, av3Var);
        Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
        while (it2.hasNext()) {
            ((su3) it2.next()).b(this, zu3Var, av3Var);
        }
    }

    public final void createOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.attached && this.hasOptionsMenu && !this.optionsMenuHidden) {
            onCreateOptionsMenu(menu, menuInflater);
        }
    }

    public final void d0(View view) {
        this.hasSavedViewState = true;
        this.viewState = new Bundle(getClass().getClassLoader());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        view.saveHierarchyState(sparseArray);
        this.viewState.putSparseParcelableArray(KEY_VIEW_STATE_HIERARCHY, sparseArray);
        Bundle bundle = new Bundle(getClass().getClassLoader());
        onSaveViewState(view, bundle);
        this.viewState.putBundle(KEY_VIEW_STATE_BUNDLE, bundle);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((su3) it.next()).f(this);
        }
    }

    public final void destroy() {
        Z(false);
    }

    public void detach(View view, boolean z, boolean z2) {
        if (!this.attachedToUnownedParent) {
            Iterator<dv3> it = this.childRouters.iterator();
            while (it.hasNext()) {
                it.next().F();
            }
        }
        boolean z3 = !z2 && (z || this.retainViewMode == tu3.a || this.isBeingDestroyed);
        if (this.attached) {
            if (this.awaitingParentAttach) {
                this.attached = false;
            } else {
                Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
                while (it2.hasNext()) {
                    ((su3) it2.next()).t(this);
                }
                this.attached = false;
                onDetach(view);
                if (this.hasOptionsMenu && !this.optionsMenuHidden) {
                    this.router.o();
                }
                Iterator it3 = new ArrayList(this.lifecycleListeners).iterator();
                while (it3.hasNext()) {
                    ((su3) it3.next()).m(this);
                }
            }
        }
        this.awaitingParentAttach = false;
        if (z3) {
            removeViewReference(view != null ? view.getContext() : null);
        }
    }

    public final boolean didRequestPermission(String str) {
        return this.requestedPermissions.contains(str);
    }

    public final void executeWithRouter(aoc aocVar) {
        if (this.router != null) {
            aocVar.a();
        } else {
            this.onRouterSetListeners.add(aocVar);
        }
    }

    public final uu3 findController(String str) {
        if (this.instanceId.equals(str)) {
            return this;
        }
        Iterator<dv3> it = this.childRouters.iterator();
        while (it.hasNext()) {
            uu3 uu3VarF = it.next().f(str);
            if (uu3VarF != null) {
                return uu3VarF;
            }
        }
        return null;
    }

    public final Activity getActivity() {
        znc zncVar = this.router;
        if (zncVar != null) {
            return zncVar.d();
        }
        return null;
    }

    public final Context getApplicationContext() {
        Activity activity = getActivity();
        if (activity != null) {
            return activity.getApplicationContext();
        }
        return null;
    }

    public Bundle getArgs() {
        return this.args;
    }

    public final znc getChildRouter(ViewGroup viewGroup) {
        return getChildRouter(viewGroup, null);
    }

    public final List<znc> getChildRouters() {
        ArrayList arrayList = new ArrayList(this.childRouters.size());
        arrayList.addAll(this.childRouters);
        return arrayList;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final boolean getNeedsAttach() {
        return this.needsAttach;
    }

    public final i3a getOnBackPressedDispatcher() {
        znc zncVar = this.router;
        if (zncVar != null) {
            return zncVar.h();
        }
        return null;
    }

    public zu3 getOverriddenPopHandler() {
        return this.overriddenPopHandler;
    }

    public final zu3 getOverriddenPushHandler() {
        return this.overriddenPushHandler;
    }

    public final uu3 getParentController() {
        return this.parentController;
    }

    public final Resources getResources() {
        Activity activity = getActivity();
        if (activity != null) {
            return activity.getResources();
        }
        return null;
    }

    public tu3 getRetainViewMode() {
        return this.retainViewMode;
    }

    public final znc getRouter() {
        return this.router;
    }

    public final uu3 getTargetController() {
        if (this.targetInstanceId != null) {
            return this.router.i().f(this.targetInstanceId);
        }
        return null;
    }

    public final View getView() {
        return this.view;
    }

    @Deprecated
    public boolean handleBack() {
        ArrayList arrayList = new ArrayList();
        Iterator<dv3> it = this.childRouters.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().e());
        }
        Collections.sort(arrayList, new v00(17));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            uu3 uu3Var = ((coc) it2.next()).a;
            if (uu3Var.isAttached()) {
                znc router = uu3Var.getRouter();
                router.getClass();
                ft.e();
                if (router.m()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final View inflate(ViewGroup viewGroup) {
        View view = this.view;
        if (view != null && view.getParent() != null && this.view.getParent() != viewGroup) {
            View view2 = this.view;
            detach(view2, true, false);
            removeViewReference(view2.getContext());
        }
        if (this.view == null) {
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((su3) it.next()).q(this);
            }
            Bundle bundle = this.viewState;
            View viewOnCreateView = onCreateView(LayoutInflater.from(viewGroup.getContext()), viewGroup, bundle == null ? null : bundle.getBundle(KEY_VIEW_STATE_BUNDLE));
            this.view = viewOnCreateView;
            if (viewOnCreateView == viewGroup) {
                throw new IllegalStateException("Controller's onCreateView method returned the parent ViewGroup. Perhaps you forgot to pass false for LayoutInflater.inflate's attachToRoot parameter?");
            }
            Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
            while (it2.hasNext()) {
                ((su3) it2.next()).j(this, this.view);
            }
            View view3 = this.view;
            Bundle bundle2 = this.viewState;
            if (bundle2 != null) {
                view3.restoreHierarchyState(bundle2.getSparseParcelableArray(KEY_VIEW_STATE_HIERARCHY));
                Bundle bundle3 = this.viewState.getBundle(KEY_VIEW_STATE_BUNDLE);
                bundle3.setClassLoader(getClass().getClassLoader());
                onRestoreViewState(view3, bundle3);
                c0();
                Iterator it3 = new ArrayList(this.lifecycleListeners).iterator();
                while (it3.hasNext()) {
                    ((su3) it3.next()).d(this);
                }
            }
            if (!this.isBeingDestroyed) {
                ey1 ey1Var = new ey1(1, this);
                gmf gmfVar = new gmf();
                gmfVar.a = false;
                gmfVar.b = false;
                gmfVar.c = false;
                gmfVar.o = 1;
                gmfVar.X = ey1Var;
                this.viewAttachHandler = gmfVar;
                this.view.addOnAttachStateChangeListener(gmfVar);
            }
        } else {
            c0();
        }
        return this.view;
    }

    public final boolean isAttached() {
        return this.attached;
    }

    public final boolean isBeingDestroyed() {
        return this.isBeingDestroyed;
    }

    public final boolean isDestroyed() {
        return this.destroyed;
    }

    public abstract void onActivityPaused(Activity activity);

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public abstract void onActivityResumed(Activity activity);

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onAttach(View view) {
    }

    public void onChangeEnded(zu3 zu3Var, av3 av3Var) {
    }

    public abstract void onChangeStarted(zu3 zu3Var, av3 av3Var);

    public void onContextAvailable(Context context) {
    }

    public void onContextUnavailable() {
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public abstract View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public void onDestroy() {
    }

    public void onDestroyView(View view) {
    }

    public void onDetach(View view) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public void onRestoreViewState(View view, Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onSaveViewState(View view, Bundle bundle) {
    }

    public final boolean optionsItemSelected(MenuItem menuItem) {
        return this.attached && this.hasOptionsMenu && !this.optionsMenuHidden && onOptionsItemSelected(menuItem);
    }

    public void overridePopHandler(zu3 zu3Var) {
        this.overriddenPopHandler = zu3Var;
    }

    public void overridePushHandler(zu3 zu3Var) {
        this.overriddenPushHandler = zu3Var;
    }

    public final void prepareForHostDetach() {
        this.needsAttach = this.needsAttach || this.attached;
        Iterator<dv3> it = this.childRouters.iterator();
        while (it.hasNext()) {
            it.next().F();
        }
    }

    public final void prepareOptionsMenu(Menu menu) {
        if (this.attached && this.hasOptionsMenu && !this.optionsMenuHidden) {
            onPrepareOptionsMenu(menu);
        }
    }

    public final void registerForActivityResult(final int i) {
        executeWithRouter(new aoc() { // from class: nu3
            @Override // defpackage.aoc
            public final void a() {
                uu3 uu3Var = this.a;
                uu3Var.router.J(i, uu3Var.instanceId);
            }
        });
    }

    public final void removeChildRouter(znc zncVar) {
        if ((zncVar instanceof dv3) && this.childRouters.remove(zncVar)) {
            zncVar.c(true);
        }
    }

    public final void removeLifecycleListener(su3 su3Var) {
        this.lifecycleListeners.remove(su3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void requestPermissions(String[] strArr, int i) {
        this.requestedPermissions.addAll(Arrays.asList(strArr));
        executeWithRouter(new ou3(this, strArr, i, 1));
    }

    public final void requestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.requestedPermissions.removeAll(Arrays.asList(strArr));
        onRequestPermissionsResult(i, strArr, iArr);
    }

    public final Bundle saveInstanceState() {
        View view;
        if (!this.hasSavedViewState && (view = this.view) != null) {
            d0(view);
        }
        Bundle bundle = new Bundle();
        bundle.putString(KEY_CLASS_NAME, getClass().getName());
        bundle.putBundle(KEY_VIEW_STATE, this.viewState);
        bundle.putBundle(KEY_ARGS, this.args);
        bundle.putString(KEY_INSTANCE_ID, this.instanceId);
        bundle.putString(KEY_TARGET_INSTANCE_ID, this.targetInstanceId);
        bundle.putStringArrayList(KEY_REQUESTED_PERMISSIONS, this.requestedPermissions);
        bundle.putBoolean(KEY_NEEDS_ATTACH, this.needsAttach || this.attached);
        bundle.putInt(KEY_RETAIN_VIEW_MODE, this.retainViewMode.ordinal());
        zu3 zu3Var = this.overriddenPushHandler;
        if (zu3Var != null) {
            bundle.putBundle(KEY_OVERRIDDEN_PUSH_HANDLER, zu3Var.j());
        }
        zu3 zu3Var2 = this.overriddenPopHandler;
        if (zu3Var2 != null) {
            bundle.putBundle(KEY_OVERRIDDEN_POP_HANDLER, zu3Var2.j());
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.childRouters.size());
        for (dv3 dv3Var : this.childRouters) {
            Bundle bundle2 = new Bundle();
            dv3Var.O(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(KEY_CHILD_ROUTERS, arrayList);
        Bundle bundle3 = new Bundle(getClass().getClassLoader());
        onSaveInstanceState(bundle3);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((su3) it.next()).e(this, bundle3);
        }
        bundle.putBundle(KEY_SAVED_STATE, bundle3);
        return bundle;
    }

    public final void setDetachFrozen(boolean z) {
        if (this.isDetachFrozen != z) {
            this.isDetachFrozen = z;
            boolean z2 = (z || this.view == null || !this.viewWasDetached) ? false : true;
            for (dv3 dv3Var : this.childRouters) {
                if (z2) {
                    dv3Var.F();
                }
                dv3Var.a0(z);
            }
            if (z2) {
                View view = this.view;
                detach(view, false, false);
                if (this.view == null) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = this.router.i;
                    if (parent == viewGroup) {
                        viewGroup.removeView(view);
                    }
                }
            }
        }
    }

    public final void setHasOptionsMenu(boolean z) {
        boolean z2 = (!this.attached || this.optionsMenuHidden || this.hasOptionsMenu == z) ? false : true;
        this.hasOptionsMenu = z;
        if (z2) {
            this.router.o();
        }
    }

    public final void setNeedsAttach(boolean z) {
        this.needsAttach = z;
    }

    public final void setOptionsMenuHidden(boolean z) {
        boolean z2 = this.attached && this.hasOptionsMenu && this.optionsMenuHidden != z;
        this.optionsMenuHidden = z;
        if (z2) {
            this.router.o();
        }
    }

    public final void setParentController(uu3 uu3Var) {
        this.parentController = uu3Var;
    }

    public void setRetainViewMode(tu3 tu3Var) {
        tu3 tu3Var2 = tu3.a;
        if (tu3Var == null) {
            tu3Var = tu3Var2;
        }
        this.retainViewMode = tu3Var;
        if (tu3Var != tu3Var2 || this.attached) {
            return;
        }
        removeViewReference(null);
    }

    public final void setRouter(znc zncVar) {
        if (this.router == zncVar) {
            b0();
            return;
        }
        this.router = zncVar;
        b0();
        Iterator<aoc> it = this.onRouterSetListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.onRouterSetListeners.clear();
    }

    public void setTargetController(uu3 uu3Var) {
        if (this.targetInstanceId != null) {
            throw new RuntimeException("Target controller already set. A controller's target may only be set once.");
        }
        this.targetInstanceId = uu3Var != null ? uu3Var.getInstanceId() : null;
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        return getActivity().shouldShowRequestPermissionRationale(str);
    }

    public final void startActivity(final Intent intent) {
        executeWithRouter(new aoc() { // from class: qu3
            @Override // defpackage.aoc
            public final void a() {
                this.a.router.T(intent);
            }
        });
    }

    public final void startActivityForResult(Intent intent, int i) {
        executeWithRouter(new ou3(this, intent, i, 0));
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.router.W(this.instanceId, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final znc getChildRouter(ViewGroup viewGroup, String str) {
        return getChildRouter(viewGroup, str, true);
    }

    public final void onContextAvailable() {
        Activity activityD = this.router.d();
        if (activityD != null && !this.isContextAvailable) {
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((su3) it.next()).o(this);
            }
            boolean z = this.router.f;
            this.onBackPressedDispatcherEnabled = z;
            if (z) {
                if (!(activityD instanceof yb3)) {
                    throw new IllegalStateException("Host activities must extend ComponentActivity when enabling OnBackPressedDispatcher support.");
                }
                getOnBackPressedDispatcher().b(this.onBackPressedCallback);
            }
            this.isContextAvailable = true;
            onContextAvailable(activityD);
            Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
            while (it2.hasNext()) {
                ((su3) it2.next()).h(this);
            }
        }
        Iterator<dv3> it3 = this.childRouters.iterator();
        while (it3.hasNext()) {
            it3.next().u();
        }
    }

    public final void onContextUnavailable(Context context) {
        for (dv3 dv3Var : this.childRouters) {
            Iterator it = dv3Var.a.iterator();
            while (true) {
                u1 u1Var = (u1) it;
                if (!u1Var.hasNext()) {
                    break;
                } else {
                    ((coc) u1Var.next()).a.onContextUnavailable(context);
                }
            }
            Iterator it2 = dv3Var.d.iterator();
            while (it2.hasNext()) {
                ((uu3) it2.next()).onContextUnavailable(context);
            }
        }
        if (this.isContextAvailable) {
            Iterator it3 = new ArrayList(this.lifecycleListeners).iterator();
            while (it3.hasNext()) {
                ((su3) it3.next()).p(this);
            }
            this.isContextAvailable = false;
            onContextUnavailable();
            if (this.onBackPressedDispatcherEnabled) {
                this.onBackPressedCallback.e();
            }
            Iterator it4 = new ArrayList(this.lifecycleListeners).iterator();
            while (it4.hasNext()) {
                ((su3) it4.next()).i(this);
            }
        }
    }

    public final void startActivityForResult(final Intent intent, final int i, final Bundle bundle) {
        executeWithRouter(new aoc() { // from class: pu3
            @Override // defpackage.aoc
            public final void a() {
                uu3 uu3Var = this.a;
                uu3Var.router.V(uu3Var.instanceId, intent, i, bundle);
            }
        });
    }

    public final znc getChildRouter(ViewGroup viewGroup, String str, boolean z) {
        return getChildRouter(viewGroup, str, z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.znc getChildRouter(android.view.ViewGroup r5, java.lang.String r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            int r0 = r5.getId()
            r1 = -1
            if (r0 == r1) goto L85
            java.util.List<dv3> r1 = r4.childRouters
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            dv3 r2 = (defpackage.dv3) r2
            boolean r3 = r2.n
            if (r3 != 0) goto L36
            android.view.ViewGroup r3 = r2.i
            if (r3 != 0) goto L36
            java.lang.String r3 = r2.l
            if (r3 == 0) goto L2e
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L36
            r2.k = r0
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Host ID can't be variable with a null tag"
            r4.<init>(r5)
            throw r4
        L36:
            int r3 = r2.k
            if (r3 != r0) goto Ld
            java.lang.String r3 = r2.l
            boolean r3 = android.text.TextUtils.equals(r6, r3)
            if (r3 == 0) goto Ld
            goto L44
        L43:
            r2 = 0
        L44:
            if (r2 != 0) goto L75
            if (r7 == 0) goto L84
            dv3 r2 = new dv3
            int r7 = r5.getId()
            r2.<init>()
            if (r8 != 0) goto L5e
            if (r6 == 0) goto L56
            goto L5e
        L56:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "ControllerHostedRouter can't be created without a tag if not bounded to its container"
            r4.<init>(r5)
            throw r4
        L5e:
            r2.k = r7
            r2.l = r6
            r2.n = r8
            r2.b0(r4, r5)
            java.util.List<dv3> r5 = r4.childRouters
            r5.add(r2)
            boolean r4 = r4.isPerformingExitTransition
            if (r4 == 0) goto L84
            r4 = 1
            r2.a0(r4)
            goto L84
        L75:
            uu3 r6 = r2.j
            if (r6 == 0) goto L7e
            android.view.ViewGroup r6 = r2.i
            if (r6 == 0) goto L7e
            goto L84
        L7e:
            r2.b0(r4, r5)
            r2.I()
        L84:
            return r2
        L85:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "You must set an id on your container."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu3.getChildRouter(android.view.ViewGroup, java.lang.String, boolean, boolean):znc");
    }
}
