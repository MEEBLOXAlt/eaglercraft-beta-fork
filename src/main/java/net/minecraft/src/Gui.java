package net.minecraft.src;

import net.lax1dude.eaglercraft.EaglerAdapter;
import net.lax1dude.eaglercraft.adapter.Tessellator;

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class Gui {

	public Gui() {
		zLevel = 0.0F;
	}

	protected void drawRect(int i, int j, int k, int l, int i1) {
		float f = (float) (i1 >> 24 & 0xff) / 255F;
		float f1 = (float) (i1 >> 16 & 0xff) / 255F;
		float f2 = (float) (i1 >> 8 & 0xff) / 255F;
		float f3 = (float) (i1 & 0xff) / 255F;
		Tessellator tessellator = Tessellator.instance;
		EaglerAdapter.glEnable(3042 /* GL_BLEND */);
		EaglerAdapter.glDisable(3553 /* GL_TEXTURE_2D */);
		EaglerAdapter.glBlendFunc(770, 771);
		EaglerAdapter.glColor4f(f1, f2, f3, f);
		tessellator.startDrawingQuads();
		tessellator.addVertex(i, l, 0.0D);
		tessellator.addVertex(k, l, 0.0D);
		tessellator.addVertex(k, j, 0.0D);
		tessellator.addVertex(i, j, 0.0D);
		tessellator.draw();
		EaglerAdapter.glEnable(3553 /* GL_TEXTURE_2D */);
		EaglerAdapter.glDisable(3042 /* GL_BLEND */);
	}

	protected void drawGradientRect(int i, int j, int k, int l, int i1, int j1) {
		float f = (float) (i1 >> 24 & 0xff) / 255F;
		float f1 = (float) (i1 >> 16 & 0xff) / 255F;
		float f2 = (float) (i1 >> 8 & 0xff) / 255F;
		float f3 = (float) (i1 & 0xff) / 255F;
		float f4 = (float) (j1 >> 24 & 0xff) / 255F;
		float f5 = (float) (j1 >> 16 & 0xff) / 255F;
		float f6 = (float) (j1 >> 8 & 0xff) / 255F;
		float f7 = (float) (j1 & 0xff) / 255F;
		EaglerAdapter.glDisable(3553 /* GL_TEXTURE_2D */);
		EaglerAdapter.glEnable(3042 /* GL_BLEND */);
		EaglerAdapter.glDisable(3008 /* GL_ALPHA_TEST */);
		EaglerAdapter.glBlendFunc(770, 771);
		EaglerAdapter.glShadeModel(7425 /* GL_SMOOTH */);
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.setColorRGBA_F(f1, f2, f3, f);
		tessellator.addVertex(k, j, 0.0D);
		tessellator.addVertex(i, j, 0.0D);
		tessellator.setColorRGBA_F(f5, f6, f7, f4);
		tessellator.addVertex(i, l, 0.0D);
		tessellator.addVertex(k, l, 0.0D);
		tessellator.draw();
		EaglerAdapter.glShadeModel(7424 /* GL_FLAT */);
		EaglerAdapter.glDisable(3042 /* GL_BLEND */);
		EaglerAdapter.glEnable(3008 /* GL_ALPHA_TEST */);
		EaglerAdapter.glEnable(3553 /* GL_TEXTURE_2D */);
	}

	public void drawCenteredString(FontRenderer fontrenderer, String s, int i, int j, int k) {
		fontrenderer.drawStringWithShadow(s, i - fontrenderer.getStringWidth(s) / 2, j, k);
	}

	public void drawString(FontRenderer fontrenderer, String s, int i, int j, int k) {
		fontrenderer.drawStringWithShadow(s, i, j, k);
	}

	public void drawTexturedModalRect(int i, int j, int k, int l, int i1, int j1) {
		float f = 0.00390625F;
		float f1 = 0.00390625F;
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(i + 0, j + j1, zLevel, (float) (k + 0) * f, (float) (l + j1) * f1);
		tessellator.addVertexWithUV(i + i1, j + j1, zLevel, (float) (k + i1) * f, (float) (l + j1) * f1);
		tessellator.addVertexWithUV(i + i1, j + 0, zLevel, (float) (k + i1) * f, (float) (l + 0) * f1);
		tessellator.addVertexWithUV(i + 0, j + 0, zLevel, (float) (k + 0) * f, (float) (l + 0) * f1);
		tessellator.draw();
	}

	protected float zLevel;
}
