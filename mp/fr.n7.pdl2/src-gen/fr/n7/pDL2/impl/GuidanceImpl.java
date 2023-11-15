/**
 * generated by Xtext 2.23.0
 */
package fr.n7.pDL2.impl;

import fr.n7.pDL2.Guidance;
import fr.n7.pDL2.PDL2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guidance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.pDL2.impl.GuidanceImpl#getTexte <em>Texte</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuidanceImpl extends ProcessElementImpl implements Guidance
{
  /**
   * The default value of the '{@link #getTexte() <em>Texte</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTexte()
   * @generated
   * @ordered
   */
  protected static final String TEXTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTexte() <em>Texte</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTexte()
   * @generated
   * @ordered
   */
  protected String texte = TEXTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GuidanceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PDL2Package.Literals.GUIDANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTexte()
  {
    return texte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTexte(String newTexte)
  {
    String oldTexte = texte;
    texte = newTexte;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL2Package.GUIDANCE__TEXTE, oldTexte, texte));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PDL2Package.GUIDANCE__TEXTE:
        return getTexte();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PDL2Package.GUIDANCE__TEXTE:
        setTexte((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PDL2Package.GUIDANCE__TEXTE:
        setTexte(TEXTE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PDL2Package.GUIDANCE__TEXTE:
        return TEXTE_EDEFAULT == null ? texte != null : !TEXTE_EDEFAULT.equals(texte);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (texte: ");
    result.append(texte);
    result.append(')');
    return result.toString();
  }

} //GuidanceImpl
