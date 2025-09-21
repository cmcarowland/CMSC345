
# Chapter 11: Software Configuration Management

## 11.1 Software Configuration Management
- Involves managing all artifacts (code, documents, data, etc.) produced during software development and support.
- Activities include defining policies, frameworks, tools, and training for artifact management.
- Goes beyond version control; includes change management and maintenance.
- Key standards: IEEE Std. 1042–1987, NASA's SCM Guidebook, SEI's CMM.

## 11.2 Policy, Process, and Artifacts
- The process and organizational policy determine which artifacts are managed and to what detail.
- Artifacts may include requirements, design, code, executables, test cases, inspection results, etc.
- Managing relationships between artifacts (e.g., requirements ↔ design, code ↔ test cases) is complex, especially with multiple versions and variants.
- Interartifact and intra-artifact relationships can create a web of dependencies, especially in large, multi-version, multi-country products.
- Business policy (e.g., allowing branching from intermediate artifacts) greatly impacts configuration management complexity.
- The development process (e.g., promotion of artifacts through test levels) also shapes artifact management needs.

## 11.3 Configuration Management Framework
### Framework includes two main models:
- Naming Model
	- Unique identification for each artifact using a six-part code: Product, Country, Release, Version, Type, Format.
	- Supports multiple products, countries, releases, versions, artifact types, and formats.
	- Attribute models can complement naming for richer identification (e.g., owner, creation date).
- Storage and Access Model
	- Defines how artifacts are stored and accessed: create, delete, view, modify, return.
	- Modify/return functions support version control and prevent conflicts.
	- Service functions: import/export, list, set/increment/change identifiers, gather, merge, promote, compare, lock/unlock, where-used.
	- Check-in/check-out terminology is common in tools.
	- Integration and build processes are essential for large projects.

## 11.4 Build and Integration and Build
- Build process integrates and converts source files to executables for a target environment.
- Simple for single programs (compile, link), complex for large systems (hundreds of files, dependencies).
- Build files (e.g., makefiles) manage build order, dependencies, and automation.
- Nightly builds and backup of previous builds are common practices.
- Automated tools and staged builds help manage complexity and errors.
- Integration and build are tightly coupled with configuration management.

# Chapter 12: Postrelease Product Support and Maintenance

## 12.1 Customer Support
- Postrelease support and maintenance last much longer than initial development.
- Support includes defect fixes and nondefect services (enhancements, consulting).
- Support is often fee-based; open source support may be limited or commercialized.
### User Problem Arrival Rate
- Problem reports surge after release, then decline (Rayleigh curve).
- Usage-time (users × months) is used to estimate support needs.
- Early support data is used to adjust resource planning.
### Customer Interface and Call Management
- Support organizations have multiple layers: customer-facing reps and technical experts.
- FAQ databases and call management tools are used.
- Support is provided via phone and online submissions; call management tools track metrics.
- Online support automates many tasks and provides escalation paths.
### Technical Problem/Fix
- Complex problems are escalated to technical analysts for code fixes.
- Fixes are prioritized and delivered as emergency or periodic fix releases.
- Documentation and propagation of fixes across versions/releases is critical.
### Fix Delivery and Fix Installs
- Fixes are delivered as regular (periodic) or emergency releases.
- Customers must apply fixes in order; emergency fixes may require special handling.
- Some fixes are corequisite with other products and must be installed together.

## 12.2 Product Maintenance Updates and Release Cycles
- Maintenance updates include small enhancements and defect fixes.
- Major enhancements are new product releases; minor ones are maintenance updates.
- Maintenance cycles vary by product; some require coordinated releases across products.
- Configuration management tools are essential for managing updates and dependencies.

## 12.3 Change Control
- Change control manages the flow of change requests: origination, approval, action, tracking, closure.
- Change requests are documented and tracked, similar to development change control.
- Resource planning and temporary staffing may be needed for high change volumes.
- All maintenance changes must be controlled and documented.
