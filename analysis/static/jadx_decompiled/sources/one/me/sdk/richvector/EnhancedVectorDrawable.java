package one.me.sdk.richvector;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import androidx.annotation.Keep;
import defpackage.au1;
import defpackage.ey1;
import defpackage.g25;
import defpackage.h4f;
import defpackage.rbf;
import defpackage.rf;
import defpackage.sbf;
import defpackage.tpa;
import defpackage.ubf;
import defpackage.v33;
import java.io.IOException;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.internal.element.ClipPathElement;
import one.me.sdk.richvector.internal.element.GroupElement;
import one.me.sdk.richvector.internal.element.PathElement;
import one.me.sdk.richvector.internal.element.Shape;
import org.xmlpull.v1.XmlPullParserException;

@Keep
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001SB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000bB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010%H\u0017¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0005H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\u0005H\u0016¢\u0006\u0004\b4\u00102J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0019\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0011H\u0016¢\u0006\u0004\b=\u0010\u0013J\u0019\u0010A\u001a\u0004\u0018\u00010>2\u0006\u00109\u001a\u000208H\u0000¢\u0006\u0004\b?\u0010@J\r\u0010B\u001a\u00020\u0016¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010DR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010ER\u0014\u0010F\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010DR\u0016\u0010I\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010DR\u0016\u0010J\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010DR\u0016\u0010K\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010DR\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lone/me/sdk/richvector/EnhancedVectorDrawable;", "Landroid/graphics/drawable/Drawable;", "Lubf;", "Landroid/content/Context;", "context", "", "resId", "<init>", "(Landroid/content/Context;I)V", "Landroid/content/res/Resources;", "resources", "(Landroid/content/res/Resources;I)V", "prototype", "(Lone/me/sdk/richvector/EnhancedVectorDrawable;)V", "Lone/me/sdk/richvector/internal/element/Shape;", "buildShape", "(I)Lone/me/sdk/richvector/internal/element/Shape;", "Le5f;", "buildScaleMatrix", "()V", "scaleAllPaths", "scaleAllStrokes", "", "value", "dp", "(F)I", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "alpha", "setAlpha", "(I)V", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "getIntrinsicWidth", "getIntrinsicHeight", "Landroid/graphics/drawable/Drawable$ConstantState;", "getConstantState", "()Landroid/graphics/drawable/Drawable$ConstantState;", "", "name", "Lone/me/sdk/richvector/VectorPath;", "findPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/VectorPath;", "invalidatePath", "Lone/me/sdk/richvector/AnimationTarget;", "findTarget$rich_vector_release", "(Ljava/lang/String;)Lone/me/sdk/richvector/AnimationTarget;", "findTarget", "getPixelSize", "()F", "I", "Landroid/content/res/Resources;", "shape", "Lone/me/sdk/richvector/internal/element/Shape;", "left", "top", "width", "height", "scaleRatio", "F", "strokeRatio", "Landroid/graphics/Matrix;", "scaleMatrix", "Landroid/graphics/Matrix;", "Companion", "g25", "rich-vector_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public class EnhancedVectorDrawable extends Drawable implements ubf {
    private static final g25 Companion = new g25();
    private static final String TAG = "EnhancedVectorDrawable";
    private int height;
    private int left;
    private final int resId;
    private final Resources resources;
    private final Matrix scaleMatrix;
    private float scaleRatio;
    private final Shape shape;
    private float strokeRatio;
    private int top;
    private int width;

    public EnhancedVectorDrawable(Context context, int i) {
        this(context.getResources(), i);
    }

    private final void buildScaleMatrix() {
        Matrix matrix = this.scaleMatrix;
        matrix.reset();
        matrix.postTranslate((this.width / 2.0f) - (this.shape.getViewportWidth() / 2.0f), (this.height / 2.0f) - (this.shape.getViewportHeight() / 2.0f));
        float fMin = Math.min(this.width / this.shape.getViewportWidth(), this.height / this.shape.getViewportHeight());
        this.scaleRatio = fMin;
        matrix.postScale(fMin, fMin, this.width / 2.0f, this.height / 2.0f);
    }

    private final Shape buildShape(int resId) throws Resources.NotFoundException {
        Shape shapeO;
        int i;
        int i2;
        Resources resources = this.resources;
        ey1 ey1Var = sbf.a;
        Shape shape = (Shape) ((LruCache) ey1Var.b).get(Integer.valueOf(resId));
        if (shape != null) {
            return new Shape(shape);
        }
        XmlResourceParser xml = resources.getXml(resId);
        v33 v33Var = new v33();
        v33 v33Var2 = new v33();
        v33 v33Var3 = new v33();
        Shape shape2 = new Shape(null, 0.0f, 0.0f, 0, 0.0f, 0.0f, null, 64, null);
        Stack stack = new Stack();
        try {
            try {
                shapeO = shape2;
                PathElement pathElementN = null;
                ClipPathElement clipPathElementL = null;
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    try {
                        String name = xml.getName();
                        if (eventType == 2) {
                            int[] iArrV = au1.v(4);
                            int length = iArrV.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    i = 0;
                                    break;
                                }
                                int i4 = iArrV[i3];
                                if (h4f.h(i4).equals(name)) {
                                    i = i4;
                                    break;
                                }
                                i3++;
                            }
                            int i5 = i == 0 ? -1 : rbf.$EnumSwitchMapping$0[au1.s(i)];
                            if (i5 == -1) {
                                continue;
                            } else if (i5 == 1) {
                                shapeO = new v33().O(xml);
                            } else if (i5 == 2) {
                                stack.push(v33Var.M(xml));
                            } else if (i5 == 3) {
                                pathElementN = v33Var2.N(xml);
                            } else {
                                if (i5 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                clipPathElementL = v33Var3.L(xml);
                            }
                        } else if (eventType == 3) {
                            int[] iArrV2 = au1.v(4);
                            int length2 = iArrV2.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= length2) {
                                    i2 = 0;
                                    break;
                                }
                                int i7 = iArrV2[i6];
                                if (h4f.h(i7).equals(name)) {
                                    i2 = i7;
                                    break;
                                }
                                i6++;
                            }
                            int i8 = i2 == 0 ? -1 : rbf.$EnumSwitchMapping$0[au1.s(i2)];
                            if (i8 == -1) {
                                continue;
                            } else if (i8 == 1) {
                                shapeO.buildTransformMatrices();
                            } else if (i8 == 2) {
                                GroupElement groupElement = (GroupElement) stack.pop();
                                if (stack.isEmpty()) {
                                    groupElement.setParent(null);
                                    shapeO.addGroup(groupElement);
                                } else {
                                    groupElement.setParent((GroupElement) stack.peek());
                                    ((GroupElement) stack.peek()).addGroup(groupElement);
                                }
                            } else if (i8 != 3) {
                                if (i8 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (clipPathElementL == null) {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                                if (stack.isEmpty()) {
                                    shapeO.addClipPath(clipPathElementL);
                                } else {
                                    ((GroupElement) stack.peek()).addClipPath(clipPathElementL);
                                }
                            } else {
                                if (pathElementN == null) {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                                if (stack.isEmpty()) {
                                    shapeO.addPath(pathElementN);
                                } else {
                                    ((GroupElement) stack.peek()).addPath(pathElementN);
                                }
                                shapeO.appendToFullPath(pathElementN.getPath());
                            }
                        }
                    } catch (IOException e) {
                        e = e;
                        shape2 = shapeO;
                        e.printStackTrace();
                        xml.close();
                        shapeO = shape2;
                        ((LruCache) ey1Var.b).put(Integer.valueOf(resId), shapeO);
                        return new Shape(shapeO);
                    } catch (XmlPullParserException e2) {
                        e = e2;
                        shape2 = shapeO;
                        e.printStackTrace();
                        xml.close();
                        shapeO = shape2;
                        ((LruCache) ey1Var.b).put(Integer.valueOf(resId), shapeO);
                        return new Shape(shapeO);
                    }
                }
                xml.close();
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (XmlPullParserException e4) {
            e = e4;
        }
        ((LruCache) ey1Var.b).put(Integer.valueOf(resId), shapeO);
        return new Shape(shapeO);
    }

    private final int dp(float value) {
        return (int) (this.resources.getDisplayMetrics().density * value);
    }

    private final void scaleAllPaths() {
        this.shape.scaleAllPaths(this.scaleMatrix);
    }

    private final void scaleAllStrokes() {
        float fMin = Math.min(this.width / this.shape.getWidth(), this.height / this.shape.getHeight());
        this.strokeRatio = fMin;
        this.shape.scaleAllStrokeWidth(fMin);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        setAlpha(this.shape.getAlpha());
        int i = this.left;
        if (i == 0 && this.top == 0) {
            this.shape.draw(canvas);
            return;
        }
        float f = this.top;
        int iSave = canvas.save();
        canvas.translate(i, f);
        try {
            this.shape.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // defpackage.ubf
    public VectorPath findPath(String name) {
        return this.shape.findPath(name);
    }

    public final AnimationTarget findTarget$rich_vector_release(String name) {
        if (tpa.f(this.shape.getName(), name)) {
            return this.shape;
        }
        AnimationTarget animationTargetFindGroup = this.shape.findGroup(name);
        return (animationTargetFindGroup == null && (animationTargetFindGroup = this.shape.findPath(name)) == null) ? this.shape.findClipPath(name) : animationTargetFindGroup;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return new rf(this);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return dp(this.shape.getHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return dp(this.shape.getWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final float getPixelSize() {
        if (this.shape.getWidth() == 0.0f || this.shape.getHeight() == 0.0f || this.shape.getViewportHeight() == 0.0f || this.shape.getViewportWidth() == 0.0f) {
            return 1.0f;
        }
        return Math.min(this.shape.getViewportWidth() / dp(this.shape.getWidth()), this.shape.getViewportHeight() / dp(this.shape.getHeight()));
    }

    @Override // defpackage.ubf
    public void invalidatePath() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        if (bounds.width() == 0 || bounds.height() == 0) {
            return;
        }
        this.left = bounds.left;
        this.top = bounds.top;
        this.width = bounds.width();
        this.height = bounds.height();
        buildScaleMatrix();
        scaleAllPaths();
        scaleAllStrokes();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.shape.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode tintMode) {
    }

    public EnhancedVectorDrawable(Resources resources, int i) throws Resources.NotFoundException {
        Shape shapeBuildShape;
        this.scaleRatio = 1.0f;
        this.strokeRatio = 1.0f;
        this.scaleMatrix = new Matrix();
        this.resources = resources;
        this.resId = i;
        if (i != 0) {
            shapeBuildShape = buildShape(i);
        } else {
            Shape.Companion.getClass();
            shapeBuildShape = Shape.EMPTY;
        }
        this.shape = shapeBuildShape;
        setBounds(0, 0, dp(shapeBuildShape.getWidth()), dp(shapeBuildShape.getHeight()));
    }

    public EnhancedVectorDrawable(EnhancedVectorDrawable enhancedVectorDrawable) {
        this.scaleRatio = 1.0f;
        this.strokeRatio = 1.0f;
        this.scaleMatrix = new Matrix();
        this.resources = enhancedVectorDrawable.resources;
        this.resId = enhancedVectorDrawable.resId;
        Shape shape = new Shape(enhancedVectorDrawable.shape);
        this.shape = shape;
        setBounds(0, 0, dp(shape.getWidth()), dp(shape.getHeight()));
    }
}
