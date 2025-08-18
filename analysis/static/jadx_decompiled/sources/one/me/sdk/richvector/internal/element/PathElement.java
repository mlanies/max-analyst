package one.me.sdk.richvector.internal.element;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.annotation.Keep;
import defpackage.je7;
import defpackage.khe;
import defpackage.m6d;
import defpackage.sra;
import defpackage.zj7;
import kotlin.Metadata;
import one.me.sdk.richvector.AnimationTarget;
import one.me.sdk.richvector.VectorPath;
import org.apache.http.cookie.ClientCookie;

@Keep
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\u00020\u001d2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020(0'¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0011¢\u0006\u0004\b,\u0010\"J\u000f\u0010-\u001a\u00020\u001dH\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001dH\u0002¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u001dH\u0002¢\u0006\u0004\b0\u0010.J\u000f\u00101\u001a\u00020\u001dH\u0002¢\u0006\u0004\b1\u0010.J\u000f\u00102\u001a\u00020\u001dH\u0002¢\u0006\u0004\b2\u0010.R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u00105R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00106R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u00109R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b:\u00105R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010CR*\u0010\u0013\u001a\u00020\u00112\u0006\u0010D\u001a\u00020\u00118\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010A\u001a\u0004\bE\u0010C\"\u0004\bF\u0010\"R*\u0010\u0014\u001a\u00020\u00112\u0006\u0010D\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010A\u001a\u0004\bG\u0010C\"\u0004\bH\u0010\"R*\u0010\u0015\u001a\u00020\u00112\u0006\u0010D\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010A\u001a\u0004\bI\u0010C\"\u0004\bJ\u0010\"R*\u0010\u0016\u001a\u00020\u00112\u0006\u0010D\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010A\u001a\u0004\bK\u0010C\"\u0004\bL\u0010\"R*\u0010\u0007\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u00058\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u00106\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010\f\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u00058\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u00106\u001a\u0004\bQ\u0010N\"\u0004\bR\u0010PR*\u0010\u000b\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u00058\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u00106\u001a\u0004\bS\u0010N\"\u0004\b,\u0010PR$\u0010U\u001a\u00020T2\u0006\u0010D\u001a\u00020T8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bU\u0010WR\u001b\u0010]\u001a\u00020X8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010_\u001a\u00020^8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010g\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010dR\u0016\u0010h\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010AR\u001e\u0010i\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006k"}, d2 = {"Lone/me/sdk/richvector/internal/element/PathElement;", "Lone/me/sdk/richvector/VectorPath;", "Lone/me/sdk/richvector/AnimationTarget;", "", "name", "", "fillAlpha", "fillColor", "Landroid/graphics/Path$FillType;", "fillType", "pathData", "strokeAlpha", "strokeColor", "Landroid/graphics/Paint$Cap;", "strokeLineCap", "Landroid/graphics/Paint$Join;", "strokeLineJoin", "", "strokeMiterLimit", "strokeWidth", "trimPathEnd", "trimPathOffset", "trimPathStart", "<init>", "(Ljava/lang/String;IILandroid/graphics/Path$FillType;Ljava/lang/String;IILandroid/graphics/Paint$Cap;Landroid/graphics/Paint$Join;FFFFF)V", "prototype", "(Lone/me/sdk/richvector/internal/element/PathElement;)V", "Landroid/graphics/Matrix;", "matrix", "Le5f;", "transform", "(Landroid/graphics/Matrix;)V", "ratio", "setStrokeRatio", "(F)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "Lsra;", "setPathData", "([Lsra;)V", "alpha", "setStrokeAlpha", "updatePath", "()V", "trimPath", "updatePaint", "makeFillPaint", "makeStrokePaint", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "I", "Landroid/graphics/Path$FillType;", "getFillType", "()Landroid/graphics/Path$FillType;", "getPathData", "Landroid/graphics/Paint$Cap;", "getStrokeLineCap", "()Landroid/graphics/Paint$Cap;", "Landroid/graphics/Paint$Join;", "getStrokeLineJoin", "()Landroid/graphics/Paint$Join;", "F", "getStrokeMiterLimit", "()F", "value", "getStrokeWidth", "setStrokeWidth", "getTrimPathEnd", "setTrimPathEnd", "getTrimPathOffset", "setTrimPathOffset", "getTrimPathStart", "setTrimPathStart", "getFillColor", "()I", "setFillColor", "(I)V", "getStrokeColor", "setStrokeColor", "getStrokeAlpha", "", "isFillAndStroke", "Z", "()Z", "Landroid/graphics/Path;", "path$delegate", "Lje7;", "getPath", "()Landroid/graphics/Path;", ClientCookie.PATH_ATTR, "Landroid/graphics/Paint;", "pathPaint", "Landroid/graphics/Paint;", "getPathPaint", "()Landroid/graphics/Paint;", "originalPath", "Landroid/graphics/Path;", "scaleMatrix", "Landroid/graphics/Matrix;", "trimmedPath", "strokeRatio", "pathDataNodes", "[Lsra;", "rich-vector_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class PathElement implements VectorPath, AnimationTarget {
    private int fillAlpha;
    private int fillColor;
    private final Path.FillType fillType;
    private boolean isFillAndStroke;
    private final String name;
    private final Path originalPath;

    /* renamed from: path$delegate, reason: from kotlin metadata */
    private final je7 path;
    private final String pathData;
    private sra[] pathDataNodes;
    private final Paint pathPaint;
    private final Matrix scaleMatrix;
    private int strokeAlpha;
    private int strokeColor;
    private final Paint.Cap strokeLineCap;
    private final Paint.Join strokeLineJoin;
    private final float strokeMiterLimit;
    private float strokeRatio;
    private float strokeWidth;
    private float trimPathEnd;
    private float trimPathOffset;
    private float trimPathStart;
    private final Path trimmedPath;

    public PathElement(String str, int i, int i2, Path.FillType fillType, String str2, int i3, int i4, Paint.Cap cap, Paint.Join join, float f, float f2, float f3, float f4, float f5) {
        Path path;
        this.name = str;
        this.fillAlpha = i;
        this.fillType = fillType;
        this.pathData = str2;
        this.strokeLineCap = cap;
        this.strokeLineJoin = join;
        this.strokeMiterLimit = f;
        this.strokeWidth = f2;
        this.trimPathEnd = f3;
        this.trimPathOffset = f4;
        this.trimPathStart = f5;
        this.fillColor = i2;
        this.strokeColor = i4;
        this.strokeAlpha = i3;
        this.path = new khe(new zj7(25, this));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.pathPaint = paint;
        if (str2 != null) {
            path = m6d.i(str2);
            path.setFillType(fillType);
        } else {
            path = new Path();
        }
        this.originalPath = path;
        Matrix matrix = new Matrix();
        matrix.reset();
        this.scaleMatrix = matrix;
        this.trimmedPath = new Path(getPath());
        this.strokeRatio = 1.0f;
        updatePaint();
    }

    private final void makeFillPaint() {
        Paint paint = this.pathPaint;
        paint.setColor(getFillColor());
        paint.setAlpha(this.fillAlpha);
        paint.setStyle(Paint.Style.FILL);
    }

    private final void makeStrokePaint() {
        Paint paint = this.pathPaint;
        paint.setColor(getStrokeColor());
        paint.setAlpha(getStrokeAlpha());
        paint.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path path_delegate$lambda$0(PathElement pathElement) {
        return new Path(pathElement.originalPath);
    }

    private final void trimPath() {
        if (this.trimPathStart == 0.0f && this.trimPathEnd == 1.0f && this.trimPathOffset == 0.0f) {
            getPath().set(this.originalPath);
            getPath().transform(this.scaleMatrix);
            return;
        }
        PathMeasure pathMeasure = new PathMeasure(this.originalPath, false);
        float length = pathMeasure.getLength();
        this.trimmedPath.reset();
        float f = this.trimPathStart;
        float f2 = this.trimPathOffset;
        pathMeasure.getSegment((f + f2) * length, (this.trimPathEnd + f2) * length, this.trimmedPath, true);
        getPath().set(this.trimmedPath);
        getPath().transform(this.scaleMatrix);
    }

    private final void updatePaint() {
        this.pathPaint.setStrokeWidth(getStrokeWidth() * this.strokeRatio);
        if (getFillColor() != 0 && getStrokeColor() != 0) {
            this.isFillAndStroke = true;
        } else if (getFillColor() != 0) {
            this.pathPaint.setColor(getFillColor());
            this.pathPaint.setAlpha(this.fillAlpha);
            this.pathPaint.setStyle(Paint.Style.FILL);
            this.isFillAndStroke = false;
        } else if (getStrokeColor() != 0) {
            this.pathPaint.setColor(getStrokeColor());
            this.pathPaint.setAlpha(getStrokeAlpha());
            this.pathPaint.setStyle(Paint.Style.STROKE);
            this.isFillAndStroke = false;
        } else {
            this.pathPaint.setColor(0);
        }
        this.pathPaint.setStrokeCap(this.strokeLineCap);
        this.pathPaint.setStrokeJoin(this.strokeLineJoin);
        this.pathPaint.setStrokeMiter(this.strokeMiterLimit);
    }

    private final void updatePath() {
        sra[] sraVarArr = this.pathDataNodes;
        if (sraVarArr == null) {
            trimPath();
            return;
        }
        getPath().reset();
        m6d.A(sraVarArr, getPath());
        getPath().transform(this.scaleMatrix);
    }

    public final void draw(Canvas canvas) {
        if (!this.isFillAndStroke) {
            canvas.drawPath(getPath(), this.pathPaint);
            return;
        }
        makeFillPaint();
        canvas.drawPath(getPath(), this.pathPaint);
        makeStrokePaint();
        canvas.drawPath(getPath(), this.pathPaint);
    }

    @Override // one.me.sdk.richvector.VectorPath
    public int getFillColor() {
        return this.fillColor;
    }

    public final Path.FillType getFillType() {
        return this.fillType;
    }

    public final String getName() {
        return this.name;
    }

    @Override // one.me.sdk.richvector.VectorPath
    public Path getPath() {
        return (Path) this.path.getValue();
    }

    public final String getPathData() {
        return this.pathData;
    }

    public final Paint getPathPaint() {
        return this.pathPaint;
    }

    @Override // one.me.sdk.richvector.VectorPath
    public int getStrokeAlpha() {
        return this.strokeAlpha;
    }

    @Override // one.me.sdk.richvector.VectorPath
    public int getStrokeColor() {
        return this.strokeColor;
    }

    public final Paint.Cap getStrokeLineCap() {
        return this.strokeLineCap;
    }

    public final Paint.Join getStrokeLineJoin() {
        return this.strokeLineJoin;
    }

    public final float getStrokeMiterLimit() {
        return this.strokeMiterLimit;
    }

    @Override // one.me.sdk.richvector.VectorPath
    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    /* renamed from: isFillAndStroke, reason: from getter */
    public final boolean getIsFillAndStroke() {
        return this.isFillAndStroke;
    }

    @Override // one.me.sdk.richvector.VectorPath
    public void setFillColor(int i) {
        this.fillColor = i;
        this.fillAlpha = (i >> 24) & 255;
        updatePaint();
    }

    public final void setPathData(sra[] pathData) {
        this.pathDataNodes = m6d.j(pathData);
        updatePath();
    }

    public final void setStrokeAlpha(float alpha) {
        setStrokeAlpha(Math.min(255, (int) (255 * alpha)));
    }

    @Override // one.me.sdk.richvector.VectorPath
    public void setStrokeColor(int i) {
        this.strokeColor = i;
        setStrokeAlpha((i >> 24) & 255);
        updatePaint();
    }

    public final void setStrokeRatio(float ratio) {
        this.strokeRatio = ratio;
        updatePaint();
    }

    @Override // one.me.sdk.richvector.VectorPath
    public void setStrokeWidth(float f) {
        this.strokeWidth = f;
        updatePaint();
    }

    public final void setTrimPathEnd(float f) {
        this.trimPathEnd = f;
        updatePath();
    }

    public final void setTrimPathOffset(float f) {
        this.trimPathOffset = f;
        updatePath();
    }

    public final void setTrimPathStart(float f) {
        this.trimPathStart = f;
        updatePath();
    }

    public final void transform(Matrix matrix) {
        this.scaleMatrix.set(matrix);
        updatePath();
    }

    @Override // one.me.sdk.richvector.VectorPath
    public void setStrokeAlpha(int i) {
        this.strokeAlpha = i;
        updatePaint();
    }

    public PathElement(PathElement pathElement) {
        this(pathElement.name, pathElement.fillAlpha, pathElement.getFillColor(), pathElement.fillType, pathElement.pathData, pathElement.getStrokeAlpha(), pathElement.getStrokeColor(), pathElement.strokeLineCap, pathElement.strokeLineJoin, pathElement.strokeMiterLimit, pathElement.getStrokeWidth(), pathElement.trimPathEnd, pathElement.trimPathOffset, pathElement.trimPathStart);
        this.isFillAndStroke = pathElement.isFillAndStroke;
        this.originalPath.set(pathElement.originalPath);
        getPath().set(pathElement.getPath());
        this.pathPaint.set(pathElement.pathPaint);
        this.scaleMatrix.set(pathElement.scaleMatrix);
        this.trimmedPath.set(pathElement.trimmedPath);
        this.strokeRatio = pathElement.getStrokeWidth();
        sra[] sraVarArr = pathElement.pathDataNodes;
        this.pathDataNodes = sraVarArr != null ? m6d.j(sraVarArr) : null;
    }
}
