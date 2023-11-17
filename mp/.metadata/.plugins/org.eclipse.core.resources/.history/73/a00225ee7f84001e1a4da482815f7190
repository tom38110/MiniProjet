/**
 */
package simplepdl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import simplepdl.Ressource;
import simplepdl.RessourceUsed;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource Used</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.RessourceUsedImpl#getOcc <em>Occ</em>}</li>
 *   <li>{@link simplepdl.impl.RessourceUsedImpl#getRessources <em>Ressources</em>}</li>
 *   <li>{@link simplepdl.impl.RessourceUsedImpl#getWorkdefinition <em>Workdefinition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceUsedImpl extends MinimalEObjectImpl.Container implements RessourceUsed {
	/**
	 * The default value of the '{@link #getOcc() <em>Occ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcc()
	 * @generated
	 * @ordered
	 */
	protected static final int OCC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOcc() <em>Occ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcc()
	 * @generated
	 * @ordered
	 */
	protected int occ = OCC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRessources() <em>Ressources</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessources()
	 * @generated
	 * @ordered
	 */
	protected Ressource ressources;

	/**
	 * The cached value of the '{@link #getWorkdefinition() <em>Workdefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkdefinition()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition workdefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceUsedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.RESSOURCE_USED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOcc() {
		return occ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcc(int newOcc) {
		int oldOcc = occ;
		occ = newOcc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE_USED__OCC, oldOcc, occ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource getRessources() {
		if (ressources != null && ressources.eIsProxy()) {
			InternalEObject oldRessources = (InternalEObject)ressources;
			ressources = (Ressource)eResolveProxy(oldRessources);
			if (ressources != oldRessources) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.RESSOURCE_USED__RESSOURCES, oldRessources, ressources));
			}
		}
		return ressources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource basicGetRessources() {
		return ressources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRessources(Ressource newRessources) {
		Ressource oldRessources = ressources;
		ressources = newRessources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE_USED__RESSOURCES, oldRessources, ressources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition getWorkdefinition() {
		if (workdefinition != null && workdefinition.eIsProxy()) {
			InternalEObject oldWorkdefinition = (InternalEObject)workdefinition;
			workdefinition = (WorkDefinition)eResolveProxy(oldWorkdefinition);
			if (workdefinition != oldWorkdefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.RESSOURCE_USED__WORKDEFINITION, oldWorkdefinition, workdefinition));
			}
		}
		return workdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition basicGetWorkdefinition() {
		return workdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkdefinition(WorkDefinition newWorkdefinition) {
		WorkDefinition oldWorkdefinition = workdefinition;
		workdefinition = newWorkdefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE_USED__WORKDEFINITION, oldWorkdefinition, workdefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE_USED__OCC:
				return getOcc();
			case SimplepdlPackage.RESSOURCE_USED__RESSOURCES:
				if (resolve) return getRessources();
				return basicGetRessources();
			case SimplepdlPackage.RESSOURCE_USED__WORKDEFINITION:
				if (resolve) return getWorkdefinition();
				return basicGetWorkdefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE_USED__OCC:
				setOcc((Integer)newValue);
				return;
			case SimplepdlPackage.RESSOURCE_USED__RESSOURCES:
				setRessources((Ressource)newValue);
				return;
			case SimplepdlPackage.RESSOURCE_USED__WORKDEFINITION:
				setWorkdefinition((WorkDefinition)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE_USED__OCC:
				setOcc(OCC_EDEFAULT);
				return;
			case SimplepdlPackage.RESSOURCE_USED__RESSOURCES:
				setRessources((Ressource)null);
				return;
			case SimplepdlPackage.RESSOURCE_USED__WORKDEFINITION:
				setWorkdefinition((WorkDefinition)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE_USED__OCC:
				return occ != OCC_EDEFAULT;
			case SimplepdlPackage.RESSOURCE_USED__RESSOURCES:
				return ressources != null;
			case SimplepdlPackage.RESSOURCE_USED__WORKDEFINITION:
				return workdefinition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (occ: ");
		result.append(occ);
		result.append(')');
		return result.toString();
	}

} //RessourceUsedImpl
