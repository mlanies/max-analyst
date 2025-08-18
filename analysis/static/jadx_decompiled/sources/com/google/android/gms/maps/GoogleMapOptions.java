package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.ay7;
import defpackage.br7;
import defpackage.n3;
import defpackage.qz7;
import defpackage.vqf;
import defpackage.y2c;

/* loaded from: classes.dex */
public final class GoogleMapOptions extends n3 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new vqf(18);
    public static final Integer F0 = Integer.valueOf(Color.argb(255, 236, 233, 225));
    public Boolean B0;
    public int E0;
    public Boolean X;
    public Boolean Y;
    public Boolean Z;
    public Boolean a;
    public Boolean b;
    public CameraPosition o;
    public Boolean s0;
    public Boolean t0;
    public Boolean u0;
    public Boolean v0;
    public Boolean w0;
    public Boolean x0;
    public int c = -1;
    public Float y0 = null;
    public Float z0 = null;
    public LatLngBounds A0 = null;
    public Integer C0 = null;
    public String D0 = null;

    public static GoogleMapOptions b(Context context, AttributeSet attributeSet) {
        String string;
        LatLngBounds latLngBounds = null;
        if (attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, y2c.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_mapType)) {
            googleMapOptions.c = typedArrayObtainAttributes.getInt(y2c.MapAttrs_mapType, -1);
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_zOrderOnTop)) {
            googleMapOptions.a = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y2c.MapAttrs_zOrderOnTop, false));
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_useViewLifecycle)) {
            googleMapOptions.b = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y2c.MapAttrs_useViewLifecycle, false));
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_uiCompass)) {
            googleMapOptions.Y = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y2c.MapAttrs_uiCompass, true));
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_uiRotateGestures)) {
            googleMapOptions.u0 = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y2c.MapAttrs_uiRotateGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_uiScrollGesturesDuringRotateOrZoom)) {
            googleMapOptions.B0 = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y2c.MapAttrs_uiScrollGesturesDuringRotateOrZoom, true));
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_uiScrollGestures)) {
            googleMapOptions.Z = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y2c.MapAttrs_uiScrollGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_uiTiltGestures)) {
            googleMapOptions.t0 = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y2c.MapAttrs_uiTiltGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_uiZoomGestures)) {
            googleMapOptions.s0 = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y2c.MapAttrs_uiZoomGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_uiZoomControls)) {
            googleMapOptions.X = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y2c.MapAttrs_uiZoomControls, true));
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_liteMode)) {
            googleMapOptions.v0 = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y2c.MapAttrs_liteMode, false));
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_uiMapToolbar)) {
            googleMapOptions.w0 = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y2c.MapAttrs_uiMapToolbar, true));
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_ambientEnabled)) {
            googleMapOptions.x0 = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y2c.MapAttrs_ambientEnabled, false));
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.y0 = Float.valueOf(typedArrayObtainAttributes.getFloat(y2c.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.z0 = Float.valueOf(typedArrayObtainAttributes.getFloat(y2c.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_backgroundColor)) {
            googleMapOptions.C0 = Integer.valueOf(typedArrayObtainAttributes.getColor(y2c.MapAttrs_backgroundColor, F0.intValue()));
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_mapId) && (string = typedArrayObtainAttributes.getString(y2c.MapAttrs_mapId)) != null && !string.isEmpty()) {
            googleMapOptions.D0 = string;
        }
        if (typedArrayObtainAttributes.hasValue(y2c.MapAttrs_mapColorScheme)) {
            googleMapOptions.E0 = typedArrayObtainAttributes.getInt(y2c.MapAttrs_mapColorScheme, 0);
        }
        TypedArray typedArrayObtainAttributes2 = context.getResources().obtainAttributes(attributeSet, y2c.MapAttrs);
        Float fValueOf = typedArrayObtainAttributes2.hasValue(y2c.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(y2c.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        Float fValueOf2 = typedArrayObtainAttributes2.hasValue(y2c.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(y2c.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        Float fValueOf3 = typedArrayObtainAttributes2.hasValue(y2c.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(y2c.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        Float fValueOf4 = typedArrayObtainAttributes2.hasValue(y2c.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(y2c.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        typedArrayObtainAttributes2.recycle();
        if (fValueOf != null && fValueOf2 != null && fValueOf3 != null && fValueOf4 != null) {
            latLngBounds = new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
        }
        googleMapOptions.A0 = latLngBounds;
        TypedArray typedArrayObtainAttributes3 = context.getResources().obtainAttributes(attributeSet, y2c.MapAttrs);
        LatLng latLng = new LatLng(typedArrayObtainAttributes3.hasValue(y2c.MapAttrs_cameraTargetLat) ? typedArrayObtainAttributes3.getFloat(y2c.MapAttrs_cameraTargetLat, 0.0f) : 0.0f, typedArrayObtainAttributes3.hasValue(y2c.MapAttrs_cameraTargetLng) ? typedArrayObtainAttributes3.getFloat(y2c.MapAttrs_cameraTargetLng, 0.0f) : 0.0f);
        float f = typedArrayObtainAttributes3.hasValue(y2c.MapAttrs_cameraZoom) ? typedArrayObtainAttributes3.getFloat(y2c.MapAttrs_cameraZoom, 0.0f) : 0.0f;
        float f2 = typedArrayObtainAttributes3.hasValue(y2c.MapAttrs_cameraBearing) ? typedArrayObtainAttributes3.getFloat(y2c.MapAttrs_cameraBearing, 0.0f) : 0.0f;
        float f3 = typedArrayObtainAttributes3.hasValue(y2c.MapAttrs_cameraTilt) ? typedArrayObtainAttributes3.getFloat(y2c.MapAttrs_cameraTilt, 0.0f) : 0.0f;
        typedArrayObtainAttributes3.recycle();
        googleMapOptions.o = new CameraPosition(latLng, f, f3, f2);
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        qz7 qz7Var = new qz7(this);
        qz7Var.h(Integer.valueOf(this.c), "MapType");
        qz7Var.h(this.v0, "LiteMode");
        qz7Var.h(this.o, "Camera");
        qz7Var.h(this.Y, "CompassEnabled");
        qz7Var.h(this.X, "ZoomControlsEnabled");
        qz7Var.h(this.Z, "ScrollGesturesEnabled");
        qz7Var.h(this.s0, "ZoomGesturesEnabled");
        qz7Var.h(this.t0, "TiltGesturesEnabled");
        qz7Var.h(this.u0, "RotateGesturesEnabled");
        qz7Var.h(this.B0, "ScrollGesturesEnabledDuringRotateOrZoom");
        qz7Var.h(this.w0, "MapToolbarEnabled");
        qz7Var.h(this.x0, "AmbientEnabled");
        qz7Var.h(this.y0, "MinZoomPreference");
        qz7Var.h(this.z0, "MaxZoomPreference");
        qz7Var.h(this.C0, "BackgroundColor");
        qz7Var.h(this.A0, "LatLngBoundsForCameraTarget");
        qz7Var.h(this.a, "ZOrderOnTop");
        qz7Var.h(this.b, "UseViewLifecycleInFragment");
        qz7Var.h(Integer.valueOf(this.E0), "mapColorScheme");
        return qz7Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        byte bE0 = br7.e0(this.a);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(bE0);
        byte bE02 = br7.e0(this.b);
        ay7.X(parcel, 3, 4);
        parcel.writeInt(bE02);
        int i2 = this.c;
        ay7.X(parcel, 4, 4);
        parcel.writeInt(i2);
        ay7.P(parcel, 5, this.o, i);
        byte bE03 = br7.e0(this.X);
        ay7.X(parcel, 6, 4);
        parcel.writeInt(bE03);
        byte bE04 = br7.e0(this.Y);
        ay7.X(parcel, 7, 4);
        parcel.writeInt(bE04);
        byte bE05 = br7.e0(this.Z);
        ay7.X(parcel, 8, 4);
        parcel.writeInt(bE05);
        byte bE06 = br7.e0(this.s0);
        ay7.X(parcel, 9, 4);
        parcel.writeInt(bE06);
        byte bE07 = br7.e0(this.t0);
        ay7.X(parcel, 10, 4);
        parcel.writeInt(bE07);
        byte bE08 = br7.e0(this.u0);
        ay7.X(parcel, 11, 4);
        parcel.writeInt(bE08);
        byte bE09 = br7.e0(this.v0);
        ay7.X(parcel, 12, 4);
        parcel.writeInt(bE09);
        byte bE010 = br7.e0(this.w0);
        ay7.X(parcel, 14, 4);
        parcel.writeInt(bE010);
        byte bE011 = br7.e0(this.x0);
        ay7.X(parcel, 15, 4);
        parcel.writeInt(bE011);
        ay7.N(parcel, 16, this.y0);
        ay7.N(parcel, 17, this.z0);
        ay7.P(parcel, 18, this.A0, i);
        byte bE012 = br7.e0(this.B0);
        ay7.X(parcel, 19, 4);
        parcel.writeInt(bE012);
        Integer num = this.C0;
        if (num != null) {
            ay7.X(parcel, 20, 4);
            parcel.writeInt(num.intValue());
        }
        ay7.Q(parcel, 21, this.D0);
        int i3 = this.E0;
        ay7.X(parcel, 23, 4);
        parcel.writeInt(i3);
        ay7.W(parcel, iT);
    }
}
