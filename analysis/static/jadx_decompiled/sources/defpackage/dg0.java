package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class dg0 {
    public final cg0 a;
    public final cg0 b = new cg0();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;

    public dg0(int i, int i2, Context context) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        cg0 cg0Var = new cg0();
        int i3 = cg0Var.a;
        if (i3 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i3);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
                attributeSet = attributeSetAsAttributeSet;
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i3));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayD = sre.d(context, attributeSet, z2c.Badge, i, styleAttribute == 0 ? i2 : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.c = typedArrayD.getDimensionPixelSize(z2c.Badge_badgeRadius, -1);
        this.i = context.getResources().getDimensionPixelSize(stb.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(stb.mtrl_badge_text_horizontal_edge_offset);
        this.d = typedArrayD.getDimensionPixelSize(z2c.Badge_badgeWithTextRadius, -1);
        this.e = typedArrayD.getDimension(z2c.Badge_badgeWidth, resources.getDimension(stb.m3_badge_size));
        this.g = typedArrayD.getDimension(z2c.Badge_badgeWithTextWidth, resources.getDimension(stb.m3_badge_with_text_size));
        this.f = typedArrayD.getDimension(z2c.Badge_badgeHeight, resources.getDimension(stb.m3_badge_size));
        this.h = typedArrayD.getDimension(z2c.Badge_badgeWithTextHeight, resources.getDimension(stb.m3_badge_with_text_size));
        this.k = typedArrayD.getInt(z2c.Badge_offsetAlignmentMode, 1);
        cg0 cg0Var2 = this.b;
        int i4 = cg0Var.t0;
        cg0Var2.t0 = i4 == -2 ? 255 : i4;
        int i5 = cg0Var.v0;
        if (i5 != -2) {
            cg0Var2.v0 = i5;
        } else if (typedArrayD.hasValue(z2c.Badge_number)) {
            this.b.v0 = typedArrayD.getInt(z2c.Badge_number, 0);
        } else {
            this.b.v0 = -1;
        }
        String str = cg0Var.u0;
        if (str != null) {
            this.b.u0 = str;
        } else if (typedArrayD.hasValue(z2c.Badge_badgeText)) {
            this.b.u0 = typedArrayD.getString(z2c.Badge_badgeText);
        }
        cg0 cg0Var3 = this.b;
        cg0Var3.z0 = cg0Var.z0;
        CharSequence charSequence = cg0Var.A0;
        cg0Var3.A0 = charSequence == null ? context.getString(wzb.mtrl_badge_numberless_content_description) : charSequence;
        cg0 cg0Var4 = this.b;
        int i6 = cg0Var.B0;
        cg0Var4.B0 = i6 == 0 ? qzb.mtrl_badge_content_description : i6;
        int i7 = cg0Var.C0;
        cg0Var4.C0 = i7 == 0 ? wzb.mtrl_exceed_max_badge_number_content_description : i7;
        Boolean bool = cg0Var.E0;
        cg0Var4.E0 = Boolean.valueOf(bool == null || bool.booleanValue());
        cg0 cg0Var5 = this.b;
        int i8 = cg0Var.w0;
        cg0Var5.w0 = i8 == -2 ? typedArrayD.getInt(z2c.Badge_maxCharacterCount, -2) : i8;
        cg0 cg0Var6 = this.b;
        int i9 = cg0Var.x0;
        cg0Var6.x0 = i9 == -2 ? typedArrayD.getInt(z2c.Badge_maxNumber, -2) : i9;
        cg0 cg0Var7 = this.b;
        Integer num = cg0Var.X;
        cg0Var7.X = Integer.valueOf(num == null ? typedArrayD.getResourceId(z2c.Badge_badgeShapeAppearance, m2c.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        cg0 cg0Var8 = this.b;
        Integer num2 = cg0Var.Y;
        cg0Var8.Y = Integer.valueOf(num2 == null ? typedArrayD.getResourceId(z2c.Badge_badgeShapeAppearanceOverlay, 0) : num2.intValue());
        cg0 cg0Var9 = this.b;
        Integer num3 = cg0Var.Z;
        cg0Var9.Z = Integer.valueOf(num3 == null ? typedArrayD.getResourceId(z2c.Badge_badgeWithTextShapeAppearance, m2c.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        cg0 cg0Var10 = this.b;
        Integer num4 = cg0Var.s0;
        cg0Var10.s0 = Integer.valueOf(num4 == null ? typedArrayD.getResourceId(z2c.Badge_badgeWithTextShapeAppearanceOverlay, 0) : num4.intValue());
        cg0 cg0Var11 = this.b;
        Integer num5 = cg0Var.b;
        cg0Var11.b = Integer.valueOf(num5 == null ? ju0.q(context, typedArrayD, z2c.Badge_backgroundColor).getDefaultColor() : num5.intValue());
        cg0 cg0Var12 = this.b;
        Integer num6 = cg0Var.o;
        cg0Var12.o = Integer.valueOf(num6 == null ? typedArrayD.getResourceId(z2c.Badge_badgeTextAppearance, m2c.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = cg0Var.c;
        if (num7 != null) {
            this.b.c = num7;
        } else if (typedArrayD.hasValue(z2c.Badge_badgeTextColor)) {
            this.b.c = Integer.valueOf(ju0.q(context, typedArrayD, z2c.Badge_badgeTextColor).getDefaultColor());
        } else {
            int iIntValue = this.b.o.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, z2c.TextAppearance);
            typedArrayObtainStyledAttributes.getDimension(z2c.TextAppearance_android_textSize, 0.0f);
            ColorStateList colorStateListQ = ju0.q(context, typedArrayObtainStyledAttributes, z2c.TextAppearance_android_textColor);
            ju0.q(context, typedArrayObtainStyledAttributes, z2c.TextAppearance_android_textColorHint);
            ju0.q(context, typedArrayObtainStyledAttributes, z2c.TextAppearance_android_textColorLink);
            typedArrayObtainStyledAttributes.getInt(z2c.TextAppearance_android_textStyle, 0);
            typedArrayObtainStyledAttributes.getInt(z2c.TextAppearance_android_typeface, 1);
            int i10 = z2c.TextAppearance_fontFamily;
            i10 = typedArrayObtainStyledAttributes.hasValue(i10) ? i10 : z2c.TextAppearance_android_fontFamily;
            typedArrayObtainStyledAttributes.getResourceId(i10, 0);
            typedArrayObtainStyledAttributes.getString(i10);
            typedArrayObtainStyledAttributes.getBoolean(z2c.TextAppearance_textAllCaps, false);
            ju0.q(context, typedArrayObtainStyledAttributes, z2c.TextAppearance_android_shadowColor);
            typedArrayObtainStyledAttributes.getFloat(z2c.TextAppearance_android_shadowDx, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(z2c.TextAppearance_android_shadowDy, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(z2c.TextAppearance_android_shadowRadius, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, z2c.MaterialTextAppearance);
            typedArrayObtainStyledAttributes2.hasValue(z2c.MaterialTextAppearance_android_letterSpacing);
            typedArrayObtainStyledAttributes2.getFloat(z2c.MaterialTextAppearance_android_letterSpacing, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.b.c = Integer.valueOf(colorStateListQ.getDefaultColor());
        }
        cg0 cg0Var13 = this.b;
        Integer num8 = cg0Var.D0;
        cg0Var13.D0 = Integer.valueOf(num8 == null ? typedArrayD.getInt(z2c.Badge_badgeGravity, 8388661) : num8.intValue());
        cg0 cg0Var14 = this.b;
        Integer num9 = cg0Var.F0;
        cg0Var14.F0 = Integer.valueOf(num9 == null ? typedArrayD.getDimensionPixelSize(z2c.Badge_badgeWidePadding, resources.getDimensionPixelSize(stb.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        cg0 cg0Var15 = this.b;
        Integer num10 = cg0Var.G0;
        cg0Var15.G0 = Integer.valueOf(num10 == null ? typedArrayD.getDimensionPixelSize(z2c.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(stb.m3_badge_with_text_vertical_padding)) : num10.intValue());
        cg0 cg0Var16 = this.b;
        Integer num11 = cg0Var.H0;
        cg0Var16.H0 = Integer.valueOf(num11 == null ? typedArrayD.getDimensionPixelOffset(z2c.Badge_horizontalOffset, 0) : num11.intValue());
        cg0 cg0Var17 = this.b;
        Integer num12 = cg0Var.I0;
        cg0Var17.I0 = Integer.valueOf(num12 == null ? typedArrayD.getDimensionPixelOffset(z2c.Badge_verticalOffset, 0) : num12.intValue());
        cg0 cg0Var18 = this.b;
        Integer num13 = cg0Var.J0;
        cg0Var18.J0 = Integer.valueOf(num13 == null ? typedArrayD.getDimensionPixelOffset(z2c.Badge_horizontalOffsetWithText, cg0Var18.H0.intValue()) : num13.intValue());
        cg0 cg0Var19 = this.b;
        Integer num14 = cg0Var.K0;
        cg0Var19.K0 = Integer.valueOf(num14 == null ? typedArrayD.getDimensionPixelOffset(z2c.Badge_verticalOffsetWithText, cg0Var19.I0.intValue()) : num14.intValue());
        cg0 cg0Var20 = this.b;
        Integer num15 = cg0Var.N0;
        cg0Var20.N0 = Integer.valueOf(num15 == null ? typedArrayD.getDimensionPixelOffset(z2c.Badge_largeFontVerticalOffsetAdjustment, 0) : num15.intValue());
        cg0 cg0Var21 = this.b;
        Integer num16 = cg0Var.L0;
        cg0Var21.L0 = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        cg0 cg0Var22 = this.b;
        Integer num17 = cg0Var.M0;
        cg0Var22.M0 = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        cg0 cg0Var23 = this.b;
        Boolean bool2 = cg0Var.O0;
        cg0Var23.O0 = Boolean.valueOf(bool2 == null ? typedArrayD.getBoolean(z2c.Badge_autoAdjustToWithinGrandparentBounds, false) : bool2.booleanValue());
        typedArrayD.recycle();
        Locale locale = cg0Var.y0;
        if (locale == null) {
            this.b.y0 = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.b.y0 = locale;
        }
        this.a = cg0Var;
    }
}
