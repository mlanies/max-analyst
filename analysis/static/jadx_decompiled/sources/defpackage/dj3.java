package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.EglBase;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class dj3 {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(i3c.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(i3c.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(i3c.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(i3c.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(i3c.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(i3c.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(i3c.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(i3c.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(i3c.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(i3c.Constraint_layout_constraintBaseline_toTopOf, 91);
        sparseIntArray.append(i3c.Constraint_layout_constraintBaseline_toBottomOf, 92);
        sparseIntArray.append(i3c.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray.append(i3c.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray.append(i3c.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray.append(i3c.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray.append(i3c.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray.append(i3c.Constraint_guidelineUseRtl, 99);
        sparseIntArray.append(i3c.Constraint_android_orientation, 27);
        sparseIntArray.append(i3c.Constraint_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(i3c.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(i3c.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(i3c.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(i3c.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray.append(i3c.Constraint_layout_goneMarginTop, 16);
        sparseIntArray.append(i3c.Constraint_layout_goneMarginRight, 14);
        sparseIntArray.append(i3c.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray.append(i3c.Constraint_layout_goneMarginStart, 15);
        sparseIntArray.append(i3c.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray.append(i3c.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray.append(i3c.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(i3c.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(i3c.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(i3c.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(i3c.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray.append(i3c.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(i3c.Constraint_layout_constraintLeft_creator, 87);
        sparseIntArray.append(i3c.Constraint_layout_constraintTop_creator, 87);
        sparseIntArray.append(i3c.Constraint_layout_constraintRight_creator, 87);
        sparseIntArray.append(i3c.Constraint_layout_constraintBottom_creator, 87);
        sparseIntArray.append(i3c.Constraint_layout_constraintBaseline_creator, 87);
        sparseIntArray.append(i3c.Constraint_android_layout_marginLeft, 24);
        sparseIntArray.append(i3c.Constraint_android_layout_marginRight, 28);
        sparseIntArray.append(i3c.Constraint_android_layout_marginStart, 31);
        sparseIntArray.append(i3c.Constraint_android_layout_marginEnd, 8);
        sparseIntArray.append(i3c.Constraint_android_layout_marginTop, 34);
        sparseIntArray.append(i3c.Constraint_android_layout_marginBottom, 2);
        sparseIntArray.append(i3c.Constraint_android_layout_width, 23);
        sparseIntArray.append(i3c.Constraint_android_layout_height, 21);
        sparseIntArray.append(i3c.Constraint_layout_constraintWidth, 95);
        sparseIntArray.append(i3c.Constraint_layout_constraintHeight, 96);
        sparseIntArray.append(i3c.Constraint_android_visibility, 22);
        sparseIntArray.append(i3c.Constraint_android_alpha, 43);
        sparseIntArray.append(i3c.Constraint_android_elevation, 44);
        sparseIntArray.append(i3c.Constraint_android_rotationX, 45);
        sparseIntArray.append(i3c.Constraint_android_rotationY, 46);
        sparseIntArray.append(i3c.Constraint_android_rotation, 60);
        sparseIntArray.append(i3c.Constraint_android_scaleX, 47);
        sparseIntArray.append(i3c.Constraint_android_scaleY, 48);
        sparseIntArray.append(i3c.Constraint_android_transformPivotX, 49);
        sparseIntArray.append(i3c.Constraint_android_transformPivotY, 50);
        sparseIntArray.append(i3c.Constraint_android_translationX, 51);
        sparseIntArray.append(i3c.Constraint_android_translationY, 52);
        sparseIntArray.append(i3c.Constraint_android_translationZ, 53);
        sparseIntArray.append(i3c.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray.append(i3c.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray.append(i3c.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray.append(i3c.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray.append(i3c.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray.append(i3c.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray.append(i3c.Constraint_layout_constraintCircle, 61);
        sparseIntArray.append(i3c.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray.append(i3c.Constraint_layout_constraintCircleAngle, 63);
        sparseIntArray.append(i3c.Constraint_animateRelativeTo, 64);
        sparseIntArray.append(i3c.Constraint_transitionEasing, 65);
        sparseIntArray.append(i3c.Constraint_drawPath, 66);
        sparseIntArray.append(i3c.Constraint_transitionPathRotate, 67);
        sparseIntArray.append(i3c.Constraint_motionStagger, 79);
        sparseIntArray.append(i3c.Constraint_android_id, 38);
        sparseIntArray.append(i3c.Constraint_motionProgress, 68);
        sparseIntArray.append(i3c.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray.append(i3c.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray.append(i3c.Constraint_layout_wrapBehaviorInParent, 97);
        sparseIntArray.append(i3c.Constraint_chainUseRtl, 71);
        sparseIntArray.append(i3c.Constraint_barrierDirection, 72);
        sparseIntArray.append(i3c.Constraint_barrierMargin, 73);
        sparseIntArray.append(i3c.Constraint_constraint_referenced_ids, 74);
        sparseIntArray.append(i3c.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(i3c.Constraint_pathMotionArc, 76);
        sparseIntArray.append(i3c.Constraint_layout_constraintTag, 77);
        sparseIntArray.append(i3c.Constraint_visibilityMode, 78);
        sparseIntArray.append(i3c.Constraint_layout_constrainedWidth, 80);
        sparseIntArray.append(i3c.Constraint_layout_constrainedHeight, 81);
        sparseIntArray.append(i3c.Constraint_polarRelativeTo, 82);
        sparseIntArray.append(i3c.Constraint_transformPivotTarget, 83);
        sparseIntArray.append(i3c.Constraint_quantizeMotionSteps, 84);
        sparseIntArray.append(i3c.Constraint_quantizeMotionPhase, 85);
        sparseIntArray.append(i3c.Constraint_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_editor_absoluteY, 6);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_editor_absoluteY, 7);
        sparseIntArray2.append(i3c.ConstraintOverride_android_orientation, 27);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_goneMarginLeft, 13);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_goneMarginTop, 16);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_goneMarginRight, 14);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_goneMarginBottom, 11);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_goneMarginStart, 15);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_goneMarginEnd, 12);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintVertical_weight, 40);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintVertical_bias, 37);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintLeft_creator, 87);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintTop_creator, 87);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintRight_creator, 87);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintBottom_creator, 87);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintBaseline_creator, 87);
        sparseIntArray2.append(i3c.ConstraintOverride_android_layout_marginLeft, 24);
        sparseIntArray2.append(i3c.ConstraintOverride_android_layout_marginRight, 28);
        sparseIntArray2.append(i3c.ConstraintOverride_android_layout_marginStart, 31);
        sparseIntArray2.append(i3c.ConstraintOverride_android_layout_marginEnd, 8);
        sparseIntArray2.append(i3c.ConstraintOverride_android_layout_marginTop, 34);
        sparseIntArray2.append(i3c.ConstraintOverride_android_layout_marginBottom, 2);
        sparseIntArray2.append(i3c.ConstraintOverride_android_layout_width, 23);
        sparseIntArray2.append(i3c.ConstraintOverride_android_layout_height, 21);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintWidth, 95);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintHeight, 96);
        sparseIntArray2.append(i3c.ConstraintOverride_android_visibility, 22);
        sparseIntArray2.append(i3c.ConstraintOverride_android_alpha, 43);
        sparseIntArray2.append(i3c.ConstraintOverride_android_elevation, 44);
        sparseIntArray2.append(i3c.ConstraintOverride_android_rotationX, 45);
        sparseIntArray2.append(i3c.ConstraintOverride_android_rotationY, 46);
        sparseIntArray2.append(i3c.ConstraintOverride_android_rotation, 60);
        sparseIntArray2.append(i3c.ConstraintOverride_android_scaleX, 47);
        sparseIntArray2.append(i3c.ConstraintOverride_android_scaleY, 48);
        sparseIntArray2.append(i3c.ConstraintOverride_android_transformPivotX, 49);
        sparseIntArray2.append(i3c.ConstraintOverride_android_transformPivotY, 50);
        sparseIntArray2.append(i3c.ConstraintOverride_android_translationX, 51);
        sparseIntArray2.append(i3c.ConstraintOverride_android_translationY, 52);
        sparseIntArray2.append(i3c.ConstraintOverride_android_translationZ, 53);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintWidth_default, 54);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintHeight_default, 55);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintWidth_max, 56);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintHeight_max, 57);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintWidth_min, 58);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintHeight_min, 59);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintCircleRadius, 62);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintCircleAngle, 63);
        sparseIntArray2.append(i3c.ConstraintOverride_animateRelativeTo, 64);
        sparseIntArray2.append(i3c.ConstraintOverride_transitionEasing, 65);
        sparseIntArray2.append(i3c.ConstraintOverride_drawPath, 66);
        sparseIntArray2.append(i3c.ConstraintOverride_transitionPathRotate, 67);
        sparseIntArray2.append(i3c.ConstraintOverride_motionStagger, 79);
        sparseIntArray2.append(i3c.ConstraintOverride_android_id, 38);
        sparseIntArray2.append(i3c.ConstraintOverride_motionTarget, 98);
        sparseIntArray2.append(i3c.ConstraintOverride_motionProgress, 68);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintWidth_percent, 69);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintHeight_percent, 70);
        sparseIntArray2.append(i3c.ConstraintOverride_chainUseRtl, 71);
        sparseIntArray2.append(i3c.ConstraintOverride_barrierDirection, 72);
        sparseIntArray2.append(i3c.ConstraintOverride_barrierMargin, 73);
        sparseIntArray2.append(i3c.ConstraintOverride_constraint_referenced_ids, 74);
        sparseIntArray2.append(i3c.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        sparseIntArray2.append(i3c.ConstraintOverride_pathMotionArc, 76);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constraintTag, 77);
        sparseIntArray2.append(i3c.ConstraintOverride_visibilityMode, 78);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constrainedWidth, 80);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_constrainedHeight, 81);
        sparseIntArray2.append(i3c.ConstraintOverride_polarRelativeTo, 82);
        sparseIntArray2.append(i3c.ConstraintOverride_transformPivotTarget, 83);
        sparseIntArray2.append(i3c.ConstraintOverride_quantizeMotionSteps, 84);
        sparseIntArray2.append(i3c.ConstraintOverride_quantizeMotionPhase, 85);
        sparseIntArray2.append(i3c.ConstraintOverride_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(i3c.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static int[] e(Barrier barrier, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = iwb.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.A0) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.A0.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:124:0x0509. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0077. Please report as an issue. */
    public static yi3 f(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        yi3 yi3Var = new yi3();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? i3c.ConstraintOverride : i3c.Constraint);
        int[] iArr = d;
        SparseIntArray sparseIntArray = e;
        String[] strArr = ema.a;
        bj3 bj3Var = yi3Var.b;
        cj3 cj3Var = yi3Var.e;
        aj3 aj3Var = yi3Var.c;
        zi3 zi3Var = yi3Var.d;
        int i3 = 3;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            xi3 xi3Var = new xi3();
            xi3Var.a = new int[10];
            xi3Var.b = new int[10];
            xi3Var.c = 0;
            xi3Var.d = new int[10];
            xi3Var.e = new float[10];
            xi3Var.f = 0;
            xi3Var.g = new int[5];
            xi3Var.h = new String[5];
            xi3Var.i = 0;
            xi3Var.j = new int[4];
            xi3Var.k = new boolean[4];
            xi3Var.l = 0;
            aj3Var.getClass();
            zi3Var.getClass();
            bj3Var.getClass();
            cj3Var.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                switch (f.get(index)) {
                    case 2:
                        xi3Var.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.I));
                        i2 = 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        i2 = 1;
                        break;
                    case 5:
                        xi3Var.c(5, typedArrayObtainStyledAttributes.getString(index));
                        i2 = 1;
                        break;
                    case 6:
                        xi3Var.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, zi3Var.C));
                        i2 = 1;
                        break;
                    case 7:
                        xi3Var.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, zi3Var.D));
                        i2 = 1;
                        break;
                    case 8:
                        xi3Var.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.J));
                        i2 = 1;
                        break;
                    case 11:
                        xi3Var.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.P));
                        i2 = 1;
                        break;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        xi3Var.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.Q));
                        i2 = 1;
                        break;
                    case 13:
                        xi3Var.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.M));
                        i2 = 1;
                        break;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        xi3Var.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.O));
                        i2 = 1;
                        break;
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        xi3Var.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.R));
                        i2 = 1;
                        break;
                    case 16:
                        xi3Var.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.N));
                        i2 = 1;
                        break;
                    case LangUtils.HASH_SEED /* 17 */:
                        xi3Var.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, zi3Var.d));
                        i2 = 1;
                        break;
                    case 18:
                        xi3Var.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, zi3Var.e));
                        i2 = 1;
                        break;
                    case 19:
                        xi3Var.a(19, typedArrayObtainStyledAttributes.getFloat(index, zi3Var.f));
                        i2 = 1;
                        break;
                    case 20:
                        xi3Var.a(20, typedArrayObtainStyledAttributes.getFloat(index, zi3Var.w));
                        i2 = 1;
                        break;
                    case 21:
                        xi3Var.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, zi3Var.c));
                        i2 = 1;
                        break;
                    case 22:
                        xi3Var.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, bj3Var.a)]);
                        i2 = 1;
                        break;
                    case 23:
                        xi3Var.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, zi3Var.b));
                        i2 = 1;
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        xi3Var.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.F));
                        i2 = 1;
                        break;
                    case 27:
                        xi3Var.b(27, typedArrayObtainStyledAttributes.getInt(index, zi3Var.E));
                        i2 = 1;
                        break;
                    case 28:
                        xi3Var.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.G));
                        i2 = 1;
                        break;
                    case 31:
                        xi3Var.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.K));
                        i2 = 1;
                        break;
                    case 34:
                        xi3Var.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.H));
                        i2 = 1;
                        break;
                    case LangUtils.HASH_OFFSET /* 37 */:
                        xi3Var.a(37, typedArrayObtainStyledAttributes.getFloat(index, zi3Var.x));
                        i2 = 1;
                        break;
                    case 38:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, yi3Var.a);
                        yi3Var.a = resourceId;
                        xi3Var.b(38, resourceId);
                        i2 = 1;
                        break;
                    case 39:
                        xi3Var.a(39, typedArrayObtainStyledAttributes.getFloat(index, zi3Var.U));
                        i2 = 1;
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                        xi3Var.a(40, typedArrayObtainStyledAttributes.getFloat(index, zi3Var.T));
                        i2 = 1;
                        break;
                    case 41:
                        xi3Var.b(41, typedArrayObtainStyledAttributes.getInt(index, zi3Var.V));
                        i2 = 1;
                        break;
                    case 42:
                        xi3Var.b(42, typedArrayObtainStyledAttributes.getInt(index, zi3Var.W));
                        i2 = 1;
                        break;
                    case 43:
                        xi3Var.a(43, typedArrayObtainStyledAttributes.getFloat(index, bj3Var.c));
                        i2 = 1;
                        break;
                    case 44:
                        xi3Var.d(44, true);
                        xi3Var.a(44, typedArrayObtainStyledAttributes.getDimension(index, cj3Var.m));
                        i2 = 1;
                        break;
                    case 45:
                        xi3Var.a(45, typedArrayObtainStyledAttributes.getFloat(index, cj3Var.b));
                        i2 = 1;
                        break;
                    case 46:
                        xi3Var.a(46, typedArrayObtainStyledAttributes.getFloat(index, cj3Var.c));
                        i2 = 1;
                        break;
                    case 47:
                        xi3Var.a(47, typedArrayObtainStyledAttributes.getFloat(index, cj3Var.d));
                        i2 = 1;
                        break;
                    case 48:
                        xi3Var.a(48, typedArrayObtainStyledAttributes.getFloat(index, cj3Var.e));
                        i2 = 1;
                        break;
                    case 49:
                        xi3Var.a(49, typedArrayObtainStyledAttributes.getDimension(index, cj3Var.f));
                        i2 = 1;
                        break;
                    case 50:
                        xi3Var.a(50, typedArrayObtainStyledAttributes.getDimension(index, cj3Var.g));
                        i2 = 1;
                        break;
                    case 51:
                        xi3Var.a(51, typedArrayObtainStyledAttributes.getDimension(index, cj3Var.i));
                        i2 = 1;
                        break;
                    case 52:
                        xi3Var.a(52, typedArrayObtainStyledAttributes.getDimension(index, cj3Var.j));
                        i2 = 1;
                        break;
                    case 53:
                        xi3Var.a(53, typedArrayObtainStyledAttributes.getDimension(index, cj3Var.k));
                        i2 = 1;
                        break;
                    case 54:
                        xi3Var.b(54, typedArrayObtainStyledAttributes.getInt(index, zi3Var.X));
                        i2 = 1;
                        break;
                    case 55:
                        xi3Var.b(55, typedArrayObtainStyledAttributes.getInt(index, zi3Var.Y));
                        i2 = 1;
                        break;
                    case 56:
                        xi3Var.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.Z));
                        i2 = 1;
                        break;
                    case 57:
                        xi3Var.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.a0));
                        i2 = 1;
                        break;
                    case 58:
                        xi3Var.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.b0));
                        i2 = 1;
                        break;
                    case 59:
                        xi3Var.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.c0));
                        i2 = 1;
                        break;
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        xi3Var.a(60, typedArrayObtainStyledAttributes.getFloat(index, cj3Var.a));
                        i2 = 1;
                        break;
                    case 62:
                        xi3Var.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.A));
                        i2 = 1;
                        break;
                    case 63:
                        xi3Var.a(63, typedArrayObtainStyledAttributes.getFloat(index, zi3Var.B));
                        i2 = 1;
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        xi3Var.b(64, i(typedArrayObtainStyledAttributes, index, aj3Var.a));
                        i2 = 1;
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            xi3Var.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            xi3Var.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        i2 = 1;
                        break;
                    case 66:
                        xi3Var.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        i2 = 1;
                        break;
                    case 67:
                        xi3Var.a(67, typedArrayObtainStyledAttributes.getFloat(index, aj3Var.e));
                        i2 = 1;
                        break;
                    case 68:
                        xi3Var.a(68, typedArrayObtainStyledAttributes.getFloat(index, bj3Var.d));
                        i2 = 1;
                        break;
                    case 69:
                        xi3Var.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        i2 = 1;
                        break;
                    case 70:
                        xi3Var.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        i2 = 1;
                        break;
                    case 71:
                        i2 = 1;
                        break;
                    case 72:
                        xi3Var.b(72, typedArrayObtainStyledAttributes.getInt(index, zi3Var.f0));
                        i2 = 1;
                        break;
                    case 73:
                        xi3Var.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.g0));
                        i2 = 1;
                        break;
                    case 74:
                        xi3Var.c(74, typedArrayObtainStyledAttributes.getString(index));
                        i2 = 1;
                        break;
                    case 75:
                        xi3Var.d(75, typedArrayObtainStyledAttributes.getBoolean(index, zi3Var.n0));
                        i2 = 1;
                        break;
                    case 76:
                        xi3Var.b(76, typedArrayObtainStyledAttributes.getInt(index, aj3Var.c));
                        i2 = 1;
                        break;
                    case 77:
                        xi3Var.c(77, typedArrayObtainStyledAttributes.getString(index));
                        i2 = 1;
                        break;
                    case 78:
                        xi3Var.b(78, typedArrayObtainStyledAttributes.getInt(index, bj3Var.b));
                        i2 = 1;
                        break;
                    case 79:
                        xi3Var.a(79, typedArrayObtainStyledAttributes.getFloat(index, aj3Var.d));
                        i2 = 1;
                        break;
                    case 80:
                        xi3Var.d(80, typedArrayObtainStyledAttributes.getBoolean(index, zi3Var.l0));
                        i2 = 1;
                        break;
                    case 81:
                        xi3Var.d(81, typedArrayObtainStyledAttributes.getBoolean(index, zi3Var.m0));
                        i2 = 1;
                        break;
                    case 82:
                        xi3Var.b(82, typedArrayObtainStyledAttributes.getInteger(index, aj3Var.b));
                        i2 = 1;
                        break;
                    case 83:
                        xi3Var.b(83, i(typedArrayObtainStyledAttributes, index, cj3Var.h));
                        i2 = 1;
                        break;
                    case 84:
                        xi3Var.b(84, typedArrayObtainStyledAttributes.getInteger(index, aj3Var.g));
                        i2 = 1;
                        break;
                    case 85:
                        xi3Var.a(85, typedArrayObtainStyledAttributes.getFloat(index, aj3Var.f));
                        i2 = 1;
                        break;
                    case 86:
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            aj3Var.i = resourceId2;
                            xi3Var.b(89, resourceId2);
                            if (aj3Var.i != -1) {
                                xi3Var.b(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            aj3Var.h = string;
                            xi3Var.c(90, string);
                            if (aj3Var.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                aj3Var.i = resourceId3;
                                xi3Var.b(89, resourceId3);
                                xi3Var.b(88, -2);
                            } else {
                                xi3Var.b(88, -1);
                            }
                        } else {
                            xi3Var.b(88, typedArrayObtainStyledAttributes.getInteger(index, aj3Var.i));
                        }
                        i2 = 1;
                        break;
                    case 87:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        i2 = 1;
                        break;
                    case 93:
                        xi3Var.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.L));
                        i2 = 1;
                        break;
                    case 94:
                        xi3Var.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zi3Var.S));
                        i2 = 1;
                        break;
                    case 95:
                        j(xi3Var, typedArrayObtainStyledAttributes, index, 0);
                        i2 = 1;
                        break;
                    case 96:
                        j(xi3Var, typedArrayObtainStyledAttributes, index, 1);
                        i2 = 1;
                        break;
                    case 97:
                        xi3Var.b(97, typedArrayObtainStyledAttributes.getInt(index, zi3Var.o0));
                        i2 = 1;
                        break;
                    case 98:
                        int i6 = qc9.G0;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == i3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            yi3Var.a = typedArrayObtainStyledAttributes.getResourceId(index, yi3Var.a);
                        }
                        i2 = 1;
                        break;
                    case 99:
                        xi3Var.d(99, typedArrayObtainStyledAttributes.getBoolean(index, zi3Var.g));
                        i2 = 1;
                        break;
                }
                i4 += i2;
                i3 = 3;
            }
        } else {
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount2; i7 += i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != i3c.Constraint_android_id && i3c.Constraint_android_layout_marginStart != index2 && i3c.Constraint_android_layout_marginEnd != index2) {
                    aj3Var.getClass();
                    zi3Var.getClass();
                    bj3Var.getClass();
                    cj3Var.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        zi3Var.p = i(typedArrayObtainStyledAttributes, index2, zi3Var.p);
                        i = 1;
                        break;
                    case 2:
                        zi3Var.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.I);
                        i = 1;
                        break;
                    case 3:
                        zi3Var.o = i(typedArrayObtainStyledAttributes, index2, zi3Var.o);
                        i = 1;
                        break;
                    case 4:
                        zi3Var.n = i(typedArrayObtainStyledAttributes, index2, zi3Var.n);
                        i = 1;
                        break;
                    case 5:
                        zi3Var.y = typedArrayObtainStyledAttributes.getString(index2);
                        i = 1;
                        break;
                    case 6:
                        zi3Var.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, zi3Var.C);
                        i = 1;
                        break;
                    case 7:
                        zi3Var.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, zi3Var.D);
                        i = 1;
                        break;
                    case 8:
                        zi3Var.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.J);
                        i = 1;
                        break;
                    case 9:
                        zi3Var.v = i(typedArrayObtainStyledAttributes, index2, zi3Var.v);
                        i = 1;
                        break;
                    case 10:
                        zi3Var.u = i(typedArrayObtainStyledAttributes, index2, zi3Var.u);
                        i = 1;
                        break;
                    case 11:
                        zi3Var.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.P);
                        i = 1;
                        break;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        zi3Var.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.Q);
                        i = 1;
                        break;
                    case 13:
                        zi3Var.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.M);
                        i = 1;
                        break;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        zi3Var.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.O);
                        i = 1;
                        break;
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        zi3Var.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.R);
                        i = 1;
                        break;
                    case 16:
                        zi3Var.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.N);
                        i = 1;
                        break;
                    case LangUtils.HASH_SEED /* 17 */:
                        zi3Var.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, zi3Var.d);
                        i = 1;
                        break;
                    case 18:
                        zi3Var.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, zi3Var.e);
                        i = 1;
                        break;
                    case 19:
                        zi3Var.f = typedArrayObtainStyledAttributes.getFloat(index2, zi3Var.f);
                        i = 1;
                        break;
                    case 20:
                        zi3Var.w = typedArrayObtainStyledAttributes.getFloat(index2, zi3Var.w);
                        i = 1;
                        break;
                    case 21:
                        zi3Var.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, zi3Var.c);
                        i = 1;
                        break;
                    case 22:
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, bj3Var.a);
                        bj3Var.a = i8;
                        bj3Var.a = iArr[i8];
                        i = 1;
                        break;
                    case 23:
                        zi3Var.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, zi3Var.b);
                        i = 1;
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        zi3Var.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.F);
                        i = 1;
                        break;
                    case 25:
                        zi3Var.h = i(typedArrayObtainStyledAttributes, index2, zi3Var.h);
                        i = 1;
                        break;
                    case 26:
                        zi3Var.i = i(typedArrayObtainStyledAttributes, index2, zi3Var.i);
                        i = 1;
                        break;
                    case 27:
                        zi3Var.E = typedArrayObtainStyledAttributes.getInt(index2, zi3Var.E);
                        i = 1;
                        break;
                    case 28:
                        zi3Var.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.G);
                        i = 1;
                        break;
                    case 29:
                        zi3Var.j = i(typedArrayObtainStyledAttributes, index2, zi3Var.j);
                        i = 1;
                        break;
                    case 30:
                        zi3Var.k = i(typedArrayObtainStyledAttributes, index2, zi3Var.k);
                        i = 1;
                        break;
                    case 31:
                        zi3Var.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.K);
                        i = 1;
                        break;
                    case 32:
                        zi3Var.s = i(typedArrayObtainStyledAttributes, index2, zi3Var.s);
                        i = 1;
                        break;
                    case 33:
                        zi3Var.t = i(typedArrayObtainStyledAttributes, index2, zi3Var.t);
                        i = 1;
                        break;
                    case 34:
                        zi3Var.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.H);
                        i = 1;
                        break;
                    case 35:
                        zi3Var.m = i(typedArrayObtainStyledAttributes, index2, zi3Var.m);
                        i = 1;
                        break;
                    case 36:
                        zi3Var.l = i(typedArrayObtainStyledAttributes, index2, zi3Var.l);
                        i = 1;
                        break;
                    case LangUtils.HASH_OFFSET /* 37 */:
                        zi3Var.x = typedArrayObtainStyledAttributes.getFloat(index2, zi3Var.x);
                        i = 1;
                        break;
                    case 38:
                        yi3Var.a = typedArrayObtainStyledAttributes.getResourceId(index2, yi3Var.a);
                        i = 1;
                        break;
                    case 39:
                        zi3Var.U = typedArrayObtainStyledAttributes.getFloat(index2, zi3Var.U);
                        i = 1;
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                        zi3Var.T = typedArrayObtainStyledAttributes.getFloat(index2, zi3Var.T);
                        i = 1;
                        break;
                    case 41:
                        zi3Var.V = typedArrayObtainStyledAttributes.getInt(index2, zi3Var.V);
                        i = 1;
                        break;
                    case 42:
                        zi3Var.W = typedArrayObtainStyledAttributes.getInt(index2, zi3Var.W);
                        i = 1;
                        break;
                    case 43:
                        bj3Var.c = typedArrayObtainStyledAttributes.getFloat(index2, bj3Var.c);
                        i = 1;
                        break;
                    case 44:
                        cj3Var.l = true;
                        cj3Var.m = typedArrayObtainStyledAttributes.getDimension(index2, cj3Var.m);
                        i = 1;
                        break;
                    case 45:
                        cj3Var.b = typedArrayObtainStyledAttributes.getFloat(index2, cj3Var.b);
                        i = 1;
                        break;
                    case 46:
                        cj3Var.c = typedArrayObtainStyledAttributes.getFloat(index2, cj3Var.c);
                        i = 1;
                        break;
                    case 47:
                        cj3Var.d = typedArrayObtainStyledAttributes.getFloat(index2, cj3Var.d);
                        i = 1;
                        break;
                    case 48:
                        cj3Var.e = typedArrayObtainStyledAttributes.getFloat(index2, cj3Var.e);
                        i = 1;
                        break;
                    case 49:
                        cj3Var.f = typedArrayObtainStyledAttributes.getDimension(index2, cj3Var.f);
                        i = 1;
                        break;
                    case 50:
                        cj3Var.g = typedArrayObtainStyledAttributes.getDimension(index2, cj3Var.g);
                        i = 1;
                        break;
                    case 51:
                        cj3Var.i = typedArrayObtainStyledAttributes.getDimension(index2, cj3Var.i);
                        i = 1;
                        break;
                    case 52:
                        cj3Var.j = typedArrayObtainStyledAttributes.getDimension(index2, cj3Var.j);
                        i = 1;
                        break;
                    case 53:
                        cj3Var.k = typedArrayObtainStyledAttributes.getDimension(index2, cj3Var.k);
                        i = 1;
                        break;
                    case 54:
                        zi3Var.X = typedArrayObtainStyledAttributes.getInt(index2, zi3Var.X);
                        i = 1;
                        break;
                    case 55:
                        zi3Var.Y = typedArrayObtainStyledAttributes.getInt(index2, zi3Var.Y);
                        i = 1;
                        break;
                    case 56:
                        zi3Var.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.Z);
                        i = 1;
                        break;
                    case 57:
                        zi3Var.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.a0);
                        i = 1;
                        break;
                    case 58:
                        zi3Var.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.b0);
                        i = 1;
                        break;
                    case 59:
                        zi3Var.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.c0);
                        i = 1;
                        break;
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        cj3Var.a = typedArrayObtainStyledAttributes.getFloat(index2, cj3Var.a);
                        i = 1;
                        break;
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        zi3Var.z = i(typedArrayObtainStyledAttributes, index2, zi3Var.z);
                        i = 1;
                        break;
                    case 62:
                        zi3Var.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.A);
                        i = 1;
                        break;
                    case 63:
                        zi3Var.B = typedArrayObtainStyledAttributes.getFloat(index2, zi3Var.B);
                        i = 1;
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        aj3Var.a = i(typedArrayObtainStyledAttributes, index2, aj3Var.a);
                        i = 1;
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            aj3Var.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            aj3Var.getClass();
                        }
                        i = 1;
                        break;
                    case 66:
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        aj3Var.getClass();
                        i = 1;
                        break;
                    case 67:
                        aj3Var.e = typedArrayObtainStyledAttributes.getFloat(index2, aj3Var.e);
                        i = 1;
                        break;
                    case 68:
                        bj3Var.d = typedArrayObtainStyledAttributes.getFloat(index2, bj3Var.d);
                        i = 1;
                        break;
                    case 69:
                        zi3Var.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        i = 1;
                        break;
                    case 70:
                        zi3Var.e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        i = 1;
                        break;
                    case 71:
                        i = 1;
                        break;
                    case 72:
                        zi3Var.f0 = typedArrayObtainStyledAttributes.getInt(index2, zi3Var.f0);
                        i = 1;
                        break;
                    case 73:
                        zi3Var.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.g0);
                        i = 1;
                        break;
                    case 74:
                        zi3Var.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        i = 1;
                        break;
                    case 75:
                        zi3Var.n0 = typedArrayObtainStyledAttributes.getBoolean(index2, zi3Var.n0);
                        i = 1;
                        break;
                    case 76:
                        aj3Var.c = typedArrayObtainStyledAttributes.getInt(index2, aj3Var.c);
                        i = 1;
                        break;
                    case 77:
                        zi3Var.k0 = typedArrayObtainStyledAttributes.getString(index2);
                        i = 1;
                        break;
                    case 78:
                        bj3Var.b = typedArrayObtainStyledAttributes.getInt(index2, bj3Var.b);
                        i = 1;
                        break;
                    case 79:
                        aj3Var.d = typedArrayObtainStyledAttributes.getFloat(index2, aj3Var.d);
                        i = 1;
                        break;
                    case 80:
                        zi3Var.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, zi3Var.l0);
                        i = 1;
                        break;
                    case 81:
                        zi3Var.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, zi3Var.m0);
                        i = 1;
                        break;
                    case 82:
                        aj3Var.b = typedArrayObtainStyledAttributes.getInteger(index2, aj3Var.b);
                        i = 1;
                        break;
                    case 83:
                        cj3Var.h = i(typedArrayObtainStyledAttributes, index2, cj3Var.h);
                        i = 1;
                        break;
                    case 84:
                        aj3Var.g = typedArrayObtainStyledAttributes.getInteger(index2, aj3Var.g);
                        i = 1;
                        break;
                    case 85:
                        aj3Var.f = typedArrayObtainStyledAttributes.getFloat(index2, aj3Var.f);
                        i = 1;
                        break;
                    case 86:
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            aj3Var.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            aj3Var.h = string2;
                            if (string2.indexOf("/") > 0) {
                                aj3Var.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, aj3Var.i);
                        }
                        i = 1;
                        break;
                    case 87:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        i = 1;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        i = 1;
                        break;
                    case 91:
                        zi3Var.q = i(typedArrayObtainStyledAttributes, index2, zi3Var.q);
                        i = 1;
                        break;
                    case 92:
                        zi3Var.r = i(typedArrayObtainStyledAttributes, index2, zi3Var.r);
                        i = 1;
                        break;
                    case 93:
                        zi3Var.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.L);
                        i = 1;
                        break;
                    case 94:
                        zi3Var.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zi3Var.S);
                        i = 1;
                        break;
                    case 95:
                        j(zi3Var, typedArrayObtainStyledAttributes, index2, 0);
                        i = 1;
                        break;
                    case 96:
                        j(zi3Var, typedArrayObtainStyledAttributes, index2, 1);
                        i = 1;
                        break;
                    case 97:
                        zi3Var.o0 = typedArrayObtainStyledAttributes.getInt(index2, zi3Var.o0);
                        i = 1;
                        break;
                }
            }
            if (zi3Var.j0 != null) {
                zi3Var.i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return yi3Var;
    }

    public static int i(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj3.j(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void k(ti3 ti3Var, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            if (i == 1) {
                                Math.abs(f3 / f2);
                            } else {
                                Math.abs(f2 / f3);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        ti3Var.G = str;
    }

    public static String l(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void a(ConstraintLayout constraintLayout) {
        b(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.c;
        HashSet hashSet = new HashSet(map.keySet());
        for (int i2 = 0; i2 < childCount; i2 += i) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (this.b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    yi3 yi3Var = (yi3) map.get(Integer.valueOf(id));
                    if (yi3Var != null) {
                        if (childAt instanceof Barrier) {
                            zi3 zi3Var = yi3Var.d;
                            zi3Var.h0 = i;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(zi3Var.f0);
                            barrier.setMargin(zi3Var.g0);
                            barrier.setAllowsGoneWidget(zi3Var.n0);
                            int[] iArr = zi3Var.i0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = zi3Var.j0;
                                if (str != null) {
                                    int[] iArrE = e(barrier, str);
                                    zi3Var.i0 = iArrE;
                                    barrier.setReferencedIds(iArrE);
                                }
                            }
                        }
                        ti3 ti3Var = (ti3) childAt.getLayoutParams();
                        ti3Var.a();
                        yi3Var.a(ti3Var);
                        HashMap map2 = yi3Var.f;
                        Class<?> cls = childAt.getClass();
                        for (String strI : map2.keySet()) {
                            pi3 pi3Var = (pi3) map2.get(strI);
                            if (!pi3Var.a) {
                                strI = wg0.i("set", strI);
                            }
                            try {
                                switch (au1.s(pi3Var.b)) {
                                    case 0:
                                        cls.getMethod(strI, Integer.TYPE).invoke(childAt, Integer.valueOf(pi3Var.c));
                                        break;
                                    case 1:
                                        cls.getMethod(strI, Float.TYPE).invoke(childAt, Float.valueOf(pi3Var.d));
                                        break;
                                    case 2:
                                        cls.getMethod(strI, Integer.TYPE).invoke(childAt, Integer.valueOf(pi3Var.g));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(strI, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(pi3Var.g);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        cls.getMethod(strI, CharSequence.class).invoke(childAt, pi3Var.e);
                                        break;
                                    case 5:
                                        cls.getMethod(strI, Boolean.TYPE).invoke(childAt, Boolean.valueOf(pi3Var.f));
                                        break;
                                    case 6:
                                        cls.getMethod(strI, Float.TYPE).invoke(childAt, Float.valueOf(pi3Var.d));
                                        break;
                                    case 7:
                                        cls.getMethod(strI, Integer.TYPE).invoke(childAt, Integer.valueOf(pi3Var.c));
                                        break;
                                }
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            } catch (NoSuchMethodException e3) {
                                e3.getMessage();
                            } catch (InvocationTargetException e4) {
                                e4.printStackTrace();
                            }
                        }
                        childAt.setLayoutParams(ti3Var);
                        bj3 bj3Var = yi3Var.b;
                        if (bj3Var.b == 0) {
                            childAt.setVisibility(bj3Var.a);
                        }
                        childAt.setAlpha(bj3Var.c);
                        cj3 cj3Var = yi3Var.e;
                        childAt.setRotation(cj3Var.a);
                        childAt.setRotationX(cj3Var.b);
                        childAt.setRotationY(cj3Var.c);
                        childAt.setScaleX(cj3Var.d);
                        childAt.setScaleY(cj3Var.e);
                        if (cj3Var.h != -1) {
                            if (((View) childAt.getParent()).findViewById(cj3Var.h) != null) {
                                float bottom = (r3.getBottom() + r3.getTop()) / 2.0f;
                                float right = (r3.getRight() + r3.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(cj3Var.f)) {
                                childAt.setPivotX(cj3Var.f);
                            }
                            if (!Float.isNaN(cj3Var.g)) {
                                childAt.setPivotY(cj3Var.g);
                            }
                        }
                        childAt.setTranslationX(cj3Var.i);
                        childAt.setTranslationY(cj3Var.j);
                        childAt.setTranslationZ(cj3Var.k);
                        if (cj3Var.l) {
                            childAt.setElevation(cj3Var.m);
                        }
                        i = 1;
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            yi3 yi3Var2 = (yi3) map.get(num);
            if (yi3Var2 != null) {
                zi3 zi3Var2 = yi3Var2.d;
                if (zi3Var2.h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = zi3Var2.i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = zi3Var2.j0;
                        if (str2 != null) {
                            int[] iArrE2 = e(barrier2, str2);
                            zi3Var2.i0 = iArrE2;
                            barrier2.setReferencedIds(iArrE2);
                        }
                    }
                    barrier2.setType(zi3Var2.f0);
                    barrier2.setMargin(zi3Var2.g0);
                    uld uldVar = ConstraintLayout.F0;
                    ti3 ti3Var2 = new ti3(-2, -2);
                    barrier2.k();
                    yi3Var2.a(ti3Var2);
                    constraintLayout.addView(barrier2, ti3Var2);
                }
                if (zi3Var2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    uld uldVar2 = ConstraintLayout.F0;
                    ti3 ti3Var3 = new ti3(-2, -2);
                    yi3Var2.a(ti3Var3);
                    constraintLayout.addView(guideline, ti3Var3);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof ri3) {
                ((ri3) childAt2).f(constraintLayout);
            }
        }
    }

    public final void c(ConstraintLayout constraintLayout) {
        dj3 dj3Var = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = dj3Var.c;
        map.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ti3 ti3Var = (ti3) childAt.getLayoutParams();
            int id = childAt.getId();
            if (dj3Var.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new yi3());
            }
            yi3 yi3Var = (yi3) map.get(Integer.valueOf(id));
            if (yi3Var != null) {
                HashMap map2 = dj3Var.a;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    pi3 pi3Var = (pi3) map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new pi3(pi3Var, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new pi3(pi3Var, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                yi3Var.f = map3;
                yi3Var.a = id;
                int i2 = ti3Var.e;
                zi3 zi3Var = yi3Var.d;
                zi3Var.h = i2;
                zi3Var.i = ti3Var.f;
                zi3Var.j = ti3Var.g;
                zi3Var.k = ti3Var.h;
                zi3Var.l = ti3Var.i;
                zi3Var.m = ti3Var.j;
                zi3Var.n = ti3Var.k;
                zi3Var.o = ti3Var.l;
                zi3Var.p = ti3Var.m;
                zi3Var.q = ti3Var.n;
                zi3Var.r = ti3Var.o;
                zi3Var.s = ti3Var.s;
                zi3Var.t = ti3Var.t;
                zi3Var.u = ti3Var.u;
                zi3Var.v = ti3Var.v;
                zi3Var.w = ti3Var.E;
                zi3Var.x = ti3Var.F;
                zi3Var.y = ti3Var.G;
                zi3Var.z = ti3Var.p;
                zi3Var.A = ti3Var.q;
                zi3Var.B = ti3Var.r;
                zi3Var.C = ti3Var.T;
                zi3Var.D = ti3Var.U;
                zi3Var.E = ti3Var.V;
                zi3Var.f = ti3Var.c;
                zi3Var.d = ti3Var.a;
                zi3Var.e = ti3Var.b;
                zi3Var.b = ((ViewGroup.MarginLayoutParams) ti3Var).width;
                zi3Var.c = ((ViewGroup.MarginLayoutParams) ti3Var).height;
                zi3Var.F = ((ViewGroup.MarginLayoutParams) ti3Var).leftMargin;
                zi3Var.G = ((ViewGroup.MarginLayoutParams) ti3Var).rightMargin;
                zi3Var.H = ((ViewGroup.MarginLayoutParams) ti3Var).topMargin;
                zi3Var.I = ((ViewGroup.MarginLayoutParams) ti3Var).bottomMargin;
                zi3Var.L = ti3Var.D;
                zi3Var.T = ti3Var.I;
                zi3Var.U = ti3Var.H;
                zi3Var.W = ti3Var.K;
                zi3Var.V = ti3Var.J;
                zi3Var.l0 = ti3Var.W;
                zi3Var.m0 = ti3Var.X;
                zi3Var.X = ti3Var.L;
                zi3Var.Y = ti3Var.M;
                zi3Var.Z = ti3Var.P;
                zi3Var.a0 = ti3Var.Q;
                zi3Var.b0 = ti3Var.N;
                zi3Var.c0 = ti3Var.O;
                zi3Var.d0 = ti3Var.R;
                zi3Var.e0 = ti3Var.S;
                zi3Var.k0 = ti3Var.Y;
                zi3Var.N = ti3Var.x;
                zi3Var.P = ti3Var.z;
                zi3Var.M = ti3Var.w;
                zi3Var.O = ti3Var.y;
                zi3Var.R = ti3Var.A;
                zi3Var.Q = ti3Var.B;
                zi3Var.S = ti3Var.C;
                zi3Var.o0 = ti3Var.Z;
                zi3Var.J = ti3Var.getMarginEnd();
                zi3Var.K = ti3Var.getMarginStart();
                int visibility = childAt.getVisibility();
                bj3 bj3Var = yi3Var.b;
                bj3Var.a = visibility;
                bj3Var.c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                cj3 cj3Var = yi3Var.e;
                cj3Var.a = rotation;
                cj3Var.b = childAt.getRotationX();
                cj3Var.c = childAt.getRotationY();
                cj3Var.d = childAt.getScaleX();
                cj3Var.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    cj3Var.f = pivotX;
                    cj3Var.g = pivotY;
                }
                cj3Var.i = childAt.getTranslationX();
                cj3Var.j = childAt.getTranslationY();
                cj3Var.k = childAt.getTranslationZ();
                if (cj3Var.l) {
                    cj3Var.m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    zi3Var.n0 = barrier.getAllowsGoneWidget();
                    zi3Var.i0 = barrier.getReferencedIds();
                    zi3Var.f0 = barrier.getType();
                    zi3Var.g0 = barrier.getMargin();
                }
            }
            i++;
            dj3Var = this;
        }
    }

    public final void d(int i, int i2, int i3, int i4) {
        HashMap map = this.c;
        if (!map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), new yi3());
        }
        yi3 yi3Var = (yi3) map.get(Integer.valueOf(i));
        if (yi3Var == null) {
            return;
        }
        zi3 zi3Var = yi3Var.d;
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    zi3Var.h = i3;
                    zi3Var.i = -1;
                    return;
                } else if (i4 == 2) {
                    zi3Var.i = i3;
                    zi3Var.h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + l(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    zi3Var.j = i3;
                    zi3Var.k = -1;
                    return;
                } else if (i4 == 2) {
                    zi3Var.k = i3;
                    zi3Var.j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    zi3Var.l = i3;
                    zi3Var.m = -1;
                    zi3Var.p = -1;
                    zi3Var.q = -1;
                    zi3Var.r = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                }
                zi3Var.m = i3;
                zi3Var.l = -1;
                zi3Var.p = -1;
                zi3Var.q = -1;
                zi3Var.r = -1;
                return;
            case 4:
                if (i4 == 4) {
                    zi3Var.o = i3;
                    zi3Var.n = -1;
                    zi3Var.p = -1;
                    zi3Var.q = -1;
                    zi3Var.r = -1;
                    return;
                }
                if (i4 != 3) {
                    throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                }
                zi3Var.n = i3;
                zi3Var.o = -1;
                zi3Var.p = -1;
                zi3Var.q = -1;
                zi3Var.r = -1;
                return;
            case 5:
                if (i4 == 5) {
                    zi3Var.p = i3;
                    zi3Var.o = -1;
                    zi3Var.n = -1;
                    zi3Var.l = -1;
                    zi3Var.m = -1;
                    return;
                }
                if (i4 == 3) {
                    zi3Var.q = i3;
                    zi3Var.o = -1;
                    zi3Var.n = -1;
                    zi3Var.l = -1;
                    zi3Var.m = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                }
                zi3Var.r = i3;
                zi3Var.o = -1;
                zi3Var.n = -1;
                zi3Var.l = -1;
                zi3Var.m = -1;
                return;
            case 6:
                if (i4 == 6) {
                    zi3Var.t = i3;
                    zi3Var.s = -1;
                    return;
                } else if (i4 == 7) {
                    zi3Var.s = i3;
                    zi3Var.t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                }
            case 7:
                if (i4 == 7) {
                    zi3Var.v = i3;
                    zi3Var.u = -1;
                    return;
                } else if (i4 == 6) {
                    zi3Var.u = i3;
                    zi3Var.v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(l(i2) + " to " + l(i4) + " unknown");
        }
    }

    public final yi3 g(int i) {
        HashMap map = this.c;
        if (!map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), new yi3());
        }
        return (yi3) map.get(Integer.valueOf(i));
    }

    public final void h(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    yi3 yi3VarF = f(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        yi3VarF.d.a = true;
                    }
                    this.c.put(Integer.valueOf(yi3VarF.a), yi3VarF);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
