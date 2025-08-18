package one.me.sdk.richvector;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import android.util.LruCache;
import androidx.annotation.Keep;
import defpackage.b25;
import defpackage.c25;
import defpackage.d25;
import defpackage.e25;
import defpackage.es3;
import defpackage.ey1;
import defpackage.je7;
import defpackage.khe;
import defpackage.le;
import defpackage.tf;
import defpackage.tpa;
import defpackage.ubf;
import defpackage.uf;
import defpackage.x53;
import defpackage.zr6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.richvector.internal.element.GroupElement;
import one.me.sdk.richvector.internal.element.PathElement;
import org.xmlpull.v1.XmlPullParserException;

@Keep
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005*\u0002Yj\b\u0007\u0018\u0000 s2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0003:\u0002gtB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010\u0010J\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020+2\u0006\u0010.\u001a\u00020\u0006H\u0014¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020+2\u0006\u00101\u001a\u00020+2\u0006\u00102\u001a\u00020+H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020%H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u0010\u0010J\u000f\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u0010\u0010J\u000f\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010\u0010J\u000f\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b:\u0010\u0010J\u000f\u0010;\u001a\u00020\fH\u0016¢\u0006\u0004\b;\u0010#J\u000f\u0010<\u001a\u00020\fH\u0016¢\u0006\u0004\b<\u0010#J\u000f\u0010=\u001a\u00020+H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\f2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020+2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\fH\u0016¢\u0006\u0004\bE\u0010#J\u0019\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\fH\u0016¢\u0006\u0004\bK\u0010#J\u0019\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010L\u001a\u00020FH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\fH\u0016¢\u0006\u0004\bP\u0010#J\u0017\u0010S\u001a\u00020\f2\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020H2\u0006\u0010U\u001a\u00020\u0006H\u0002¢\u0006\u0004\bV\u0010WR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010XR\u0014\u0010@\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R$\u0010`\u001a\u0012\u0012\u0004\u0012\u00020H0^j\b\u0012\u0004\u0012\u00020H`_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR \u0010c\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020F0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u001b\u0010o\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001c\u0010q\u001a\b\u0012\u0004\u0012\u00020?0p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006u"}, d2 = {"Lone/me/sdk/richvector/EnhancedAnimatedVectorDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "", "Landroid/content/Context;", "context", "", "resId", "<init>", "(Landroid/content/Context;I)V", "Landroid/graphics/Canvas;", "canvas", "Le5f;", "draw", "(Landroid/graphics/Canvas;)V", "getAlpha", "()I", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getColorFilter", "()Landroid/graphics/ColorFilter;", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "jumpToCurrentState", "()V", "getOpacity", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "", "state", "", "onStateChange", "([I)Z", "level", "onLevelChange", "(I)Z", "visible", "restart", "setVisible", "(ZZ)Z", "getDirtyBounds", "()Landroid/graphics/Rect;", "getIntrinsicWidth", "getIntrinsicHeight", "getMinimumWidth", "getMinimumHeight", "start", "stop", "isRunning", "()Z", "Lle;", "callback", "registerAnimationCallback", "(Lle;)V", "unregisterAnimationCallback", "(Lle;)Z", "clearAnimationCallbacks", "", "targetName", "Landroid/animation/Animator;", "findAnimations", "(Ljava/lang/String;)Landroid/animation/Animator;", "invalidateAnimations", "name", "Lone/me/sdk/richvector/VectorPath;", "findPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/VectorPath;", "invalidatePath", "Landroid/animation/AnimatorSet;", "animatorSet", "prepareLocalAnimators", "(Landroid/animation/AnimatorSet;)V", "index", "prepareLocalAnimator", "(I)Landroid/animation/Animator;", "I", "e25", "Le25;", "Lone/me/sdk/richvector/EnhancedVectorDrawable;", "drawable", "Lone/me/sdk/richvector/EnhancedVectorDrawable;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "animators", "Ljava/util/ArrayList;", "Landroid/util/ArrayMap;", "targetNameMap", "Landroid/util/ArrayMap;", "animatorSetFromXml", "Landroid/animation/AnimatorSet;", "Lc25;", "animator", "Lc25;", "d25", "animatorListener$delegate", "Lje7;", "getAnimatorListener", "()Ld25;", "animatorListener", "", "animationCallbacks", "Ljava/util/List;", "Companion", "b25", "rich-vector_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ResourceType"})
/* loaded from: classes2.dex */
public final class EnhancedAnimatedVectorDrawable extends Drawable implements Animatable, ubf {
    private static final b25 Companion = new b25();

    @Deprecated
    public static final boolean SHOULD_IGNORE_INVALID_ANIMATION = true;
    private c25 animator;
    private AnimatorSet animatorSetFromXml;
    private final ArrayList<Animator> animators;
    private final EnhancedVectorDrawable drawable;
    private final int resId;
    private final ArrayMap<Animator, String> targetNameMap;
    private final e25 callback = new e25(this);

    /* renamed from: animatorListener$delegate, reason: from kotlin metadata */
    private final je7 animatorListener = new khe(new es3(10, this));
    private List<le> animationCallbacks = new ArrayList();

    public EnhancedAnimatedVectorDrawable(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        tf tfVar;
        int i2;
        int attributeResourceValue;
        this.resId = i;
        uf ufVar = new uf(context);
        ey1 ey1Var = uf.c;
        tf tfVar2 = (tf) ((LruCache) ey1Var.b).get(Integer.valueOf(i));
        if (tfVar2 != null) {
            ArrayList arrayList = new ArrayList();
            ArrayMap arrayMap = new ArrayMap();
            for (Animator animator : tfVar2.b) {
                Animator animatorClone = animator.clone();
                arrayList.add(animatorClone);
                arrayMap.put(animatorClone, tfVar2.c.get(animator));
            }
            tfVar = new tf(new EnhancedVectorDrawable(tfVar2.a), arrayList, arrayMap);
        } else {
            tfVar = null;
        }
        if (tfVar == null) {
            XmlResourceParser xml = ufVar.b.getXml(i);
            int next = xml.next();
            while (true) {
                i2 = 1;
                if (next == 2 || next == 1) {
                    break;
                } else {
                    next = xml.next();
                }
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayMap arrayMap2 = new ArrayMap();
            try {
                try {
                    int eventType = xml.getEventType();
                    int depth = xml.getDepth();
                    EnhancedVectorDrawable enhancedVectorDrawable = null;
                    while (eventType != i2) {
                        if (xml.getDepth() < depth && eventType == 3) {
                            break;
                        }
                        if (eventType != 2) {
                            eventType = xml.next();
                        } else {
                            String name = xml.getName();
                            if (tpa.f(name, "animated-vector")) {
                                EnhancedVectorDrawable enhancedVectorDrawableB = ufVar.b(xml);
                                enhancedVectorDrawableB.getPixelSize();
                                enhancedVectorDrawable = enhancedVectorDrawableB;
                            } else if (tpa.f(name, "target")) {
                                int attributeCount = xml.getAttributeCount();
                                String attributeValue = null;
                                for (int i3 = 0; i3 < attributeCount; i3++) {
                                    String attributeName = xml.getAttributeName(i3);
                                    if (tpa.f(attributeName, "name")) {
                                        attributeValue = xml.getAttributeValue(i3);
                                    } else if (tpa.f(attributeName, "animation") && (attributeResourceValue = xml.getAttributeResourceValue(i3, 0)) != 0) {
                                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(ufVar.a, attributeResourceValue);
                                        animatorLoadAnimator = uf.c(animatorLoadAnimator) ? ufVar.a(attributeResourceValue) : animatorLoadAnimator;
                                        arrayList2.add(animatorLoadAnimator);
                                        arrayMap2.put(animatorLoadAnimator, attributeValue);
                                    }
                                }
                            }
                            eventType = xml.next();
                            i2 = 1;
                        }
                    }
                    xml.close();
                    if (enhancedVectorDrawable == null) {
                        throw new IllegalArgumentException("VectorDrawable was not found in XML".toString());
                    }
                    tfVar = new tf(enhancedVectorDrawable, arrayList2, arrayMap2);
                    ((LruCache) ey1Var.b).put(Integer.valueOf(i), tfVar);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw e;
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                    throw e2;
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        }
        e25 e25Var = this.callback;
        EnhancedVectorDrawable enhancedVectorDrawable2 = tfVar.a;
        enhancedVectorDrawable2.setCallback(e25Var);
        this.drawable = enhancedVectorDrawable2;
        this.animators = tfVar.b;
        this.targetNameMap = tfVar.c;
        AnimatorSet animatorSet = new AnimatorSet();
        prepareLocalAnimators(animatorSet);
        this.animatorSetFromXml = animatorSet;
        this.animator = new c25(this, animatorSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d25 animatorListener_delegate$lambda$0(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable) {
        return new d25(enhancedAnimatedVectorDrawable);
    }

    private final d25 getAnimatorListener() {
        return (d25) this.animatorListener.getValue();
    }

    private final Animator prepareLocalAnimator(int index) {
        Animator animator = this.animators.get(index);
        Animator animatorClone = animator.clone();
        String str = this.targetNameMap.get(animator);
        AnimationTarget animationTargetFindTarget$rich_vector_release = str != null ? this.drawable.findTarget$rich_vector_release(str) : null;
        if (animationTargetFindTarget$rich_vector_release == null) {
            throw new IllegalStateException(zr6.i("Target with the name \"", str, "\" cannot be found in the VectorDrawable to be animated."));
        }
        if ((animationTargetFindTarget$rich_vector_release instanceof GroupElement) || (animationTargetFindTarget$rich_vector_release instanceof PathElement)) {
            animatorClone.setTarget(animationTargetFindTarget$rich_vector_release);
            return animatorClone;
        }
        throw new UnsupportedOperationException("Target should be either GroupElement or PathElement, " + animationTargetFindTarget$rich_vector_release.getClass() + " is not supported");
    }

    private final void prepareLocalAnimators(AnimatorSet animatorSet) {
        int size = this.animators.size();
        if (size > 0) {
            AnimatorSet.Builder builderPlay = animatorSet.play(prepareLocalAnimator(0));
            for (int i = 1; i < size; i++) {
                builderPlay.with(prepareLocalAnimator(i));
            }
        }
    }

    public void clearAnimationCallbacks() {
        c25 c25Var = this.animator;
        c25Var.b.removeListener(getAnimatorListener());
        this.animationCallbacks.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        c25 c25Var = this.animator;
        if (c25Var.b.isStarted()) {
            c25Var.a.invalidateSelf();
        }
        this.drawable.draw(canvas);
    }

    public Animator findAnimations(String targetName) {
        Integer numValueOf = Integer.valueOf(x53.k0(this.targetNameMap.values(), targetName));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return this.targetNameMap.keyAt(numValueOf.intValue());
    }

    @Override // defpackage.ubf
    public VectorPath findPath(String name) {
        return this.drawable.findPath(name);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.drawable.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.drawable.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.drawable.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.drawable.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.drawable.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void invalidateAnimations() {
        AnimatorSet animatorSet = new AnimatorSet();
        prepareLocalAnimators(animatorSet);
        this.animatorSetFromXml = animatorSet;
        c25 c25Var = this.animator;
        c25Var.b.removeListener(getAnimatorListener());
        c25 c25Var2 = new c25(this, this.animatorSetFromXml);
        if (this.animationCallbacks.size() != 0) {
            c25Var2.b.addListener(getAnimatorListener());
        }
        this.animator = c25Var2;
    }

    @Override // defpackage.ubf
    public void invalidatePath() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.animator.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.animator.b.end();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        this.drawable.setBounds(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int level) {
        return this.drawable.setLevel(level);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] state) {
        return this.drawable.setState(state);
    }

    public void registerAnimationCallback(le callback) {
        if (this.animationCallbacks.size() == 0) {
            c25 c25Var = this.animator;
            c25Var.b.addListener(getAnimatorListener());
        }
        if (this.animationCallbacks.contains(callback)) {
            return;
        }
        this.animationCallbacks.add(callback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.drawable.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
        this.drawable.setTintList(tint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode tintMode) {
        this.drawable.setTintMode(tintMode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        c25 c25Var = this.animator;
        if (c25Var.c && c25Var.b.isStarted()) {
            if (visible) {
                this.animator.b.resume();
            } else {
                this.animator.b.pause();
            }
        }
        this.drawable.setVisible(visible, restart);
        return super.setVisible(visible, restart);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        c25 c25Var = this.animator;
        AnimatorSet animatorSet = c25Var.b;
        if (animatorSet.isStarted()) {
            return;
        }
        animatorSet.start();
        c25Var.a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.animator.b.end();
    }

    public boolean unregisterAnimationCallback(le callback) {
        boolean zRemove = this.animationCallbacks.remove(callback);
        if (this.animationCallbacks.size() == 0) {
            c25 c25Var = this.animator;
            c25Var.b.removeListener(getAnimatorListener());
        }
        return zRemove;
    }
}
